'use strict';
/*jshint node:true*/

const fs = require('fs');
const path = require('path');

const primitives = [
  "byte", "short", "int", "long", "float", "double", "char", 
];

const primitivesAbbreviated = [
  "B", "S", "I", "L", "F", "D", "C",
];

const primitivesTrove = [
  "Byte", "Short", "Int", "Long", "Float", "Double", "Char", 
];

const primitivesClasspath = [
  "Byte", "Short", "Integer", "Long", "Float", "Double", "Character",
];

const primitivesGson = [
  "Byte", "Short", "Int", "Long", "Float", "Double", "Character",
];

const primitivesParse = [
  "Byte.parseByte",
  "Short.parseShort",
  "Integer.parseInt",
  "Long.parseLong",
  "Float.parseFloat",
  "Double.parseDouble",
  "Grove.parseChar",
];

function getTokens(i, j = undefined) {
  const tokens = {};

  tokens.keyPrim = tokens.prim = primitives[i];
  tokens.keyName = tokens.name = primitivesAbbreviated[i];
  tokens.keyShrt = tokens.shrt = primitivesTrove[i];
  tokens.keyLong = tokens.long = primitivesClasspath[i];
  tokens.keyLongGson = tokens.longGson = primitivesGson[i];
  tokens.keySpecialCaseParse = primitivesParse[i];
  if (j !== undefined) {
    tokens.valPrim = primitives[j];
    tokens.valName = primitivesAbbreviated[j];
    tokens.valShrt = primitivesTrove[j];
    tokens.valLong = primitivesClasspath[j];
    tokens.valLongGson = primitivesGson[j];
    tokens.kvShort = primitivesTrove[i] + primitivesTrove[j];
  }

  return tokens;
}

function process(inputTemplateDirectory, outputDirectory) {
  const files = fs.readdirSync(inputTemplateDirectory);

  for (const file of files) {
    const str = fs.readFileSync(path.join(inputTemplateDirectory, file), 'utf8');

    if (!file.includes("$key") && !file.includes("$val")) {
      // $prim$ = byte, char, etc.
      // $name$ = B, C, etc.
      // $shrt$ = Byte, Char, etc.
      // $long$ = Byte, Character, etc.
      // $longGson$ = Byte, Character, etc. but Int instead of Integer
      // $keyPrim$ = byte, char, etc.
      // $keyName$ = B, C, etc.
      // $keyShrt$ = Byte, Char, etc.
      // $keyLong$ = Byte, Character, etc.
      // $keyLongGson$, $valLongGson$ = Byte, Character, etc. but Int instead of Integer
      // $keySpecialCaseParse$ = Byte.parseByte, Integer.parseInt, Grove.parseChar

      for (let i = 0; i < primitives.length; i++) {

        let s = str;
        let f = file;

        for (const [token, val] of Object.entries(getTokens(i))) {
          let regex = new RegExp(String.raw`\$${token}\$`, 'g');
          s = s.replace(regex, val);
          f = f.replace(regex, val);
        }

        fs.writeFileSync(path.join(outputDirectory, f), s);
      }
    } else {
      // $keyPrim$, $valPrim$ = byte, char, etc.
      // $keyName$, $valName$ = B, C, etc.
      // $keyShrt$, $valShrt$ = Byte, Char, etc.
      // $keyLong$, $valLong$ = Byte, Character, etc.
      // $keyLongGson$, $valLongGson$ = Byte, Character, etc. but Int instead of Integer
      // $keySpecialCaseParse$ = Byte.parseByte, Integer.parseInt, Grove.parseChar
      // $kvShort$ = ByteByte, ByteChar, etc.

      for (let i = 0; i < primitives.length; i++)
      for (let j = 0; j < primitives.length; j++) {
        let s = str;
        let f = file;

        for (const [token, val] of Object.entries(getTokens(i, j))) {
          let regex = new RegExp(String.raw`\$${token}\$`, 'g');
          s = s.replace(regex, val);
          f = f.replace(regex, val);
        }

        fs.writeFileSync(path.join(outputDirectory, f), s);
      }

    }
  }
}

process('./generators', 'src/main/java/fallk/grove');
process('./test-generators', 'src/test/java/fallk/grove');