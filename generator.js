'use strict';
/*jshint node:true*/

const fs = require('fs');

const primitives = [
  "byte", "short", "int", "long", "float", "double", "char", 
];

const capPrimitives = [
  "Byte", "Short", "Int", "Long", "Float", "Double", "Char", 
];

const nPrimitives = [
  "Byte", "Short", "Integer", "Long", "Float", "Double", "Character", 
];

function findPrimitives(str) {
  const matches = str.match(/\$primitive([0-9]+)?\$/g);
  let prim = 1;

  for (let match of matches) {
    const i = parseInt(match.substring('$primitive'.length, match.length - 1));
    if (i > prim) {
      prim = i;
    }
  }

  return prim;
}

const files = fs.readdirSync('./generators/');

for (const file of files) {
  const str = fs.readFileSync('./generators/' + file, 'utf8');

  const numPrimitives = findPrimitives(str);

  const len = primitives.length;

  if (numPrimitives == 1) {

    for (let i = 0; i < len; i++) {
      let s = str.replace(/\$primitive\$/g, primitives[i])
                 .replace(/\$primitiveFmt\$/g, capPrimitives[i])
                 .replace(/\$primitiveN\$/g, nPrimitives[i]);

      let f = file.replace(/\$primitive\$/g, primitives[i])
                  .replace(/\$primitiveFmt\$/g, capPrimitives[i])
                  .replace(/\$primitiveN\$/g, nPrimitives[i]);

      fs.writeFileSync('./src/main/java/fallk/grove/' + f, s);
    }

  } else if (numPrimitives == 2) {

    for (let i = 0; i < len; i++)
    for (let j = 0; j < len; j++) {
      let s = str.replace(/\$primitive\$/g, primitives[i])
                 .replace(/\$primitiveFmt\$/g, capPrimitives[i])
                 .replace(/\$primitiveN\$/g, nPrimitives[i])
                 .replace(/\$primitive2\$/g, primitives[j])
                 .replace(/\$primitiveFmt2\$/g, capPrimitives[j])
                 .replace(/\$primitiveN2\$/g, capPrimitives[j]);

      let f = file.replace(/\$primitive\$/g, primitives[i])
                  .replace(/\$primitiveFmt\$/g, capPrimitives[i])
                  .replace(/\$primitiveN\$/g, nPrimitives[i])
                  .replace(/\$primitive2\$/g, primitives[j])
                  .replace(/\$primitiveFmt2\$/g, capPrimitives[j])
                  .replace(/\$primitiveN2\$/g, capPrimitives[j]);

      fs.writeFileSync('./src/main/java/fallk/grove/' + f, s);
    }

  }/* else if (numPrimitives == 3) {

    for (let i = 0; i < len; i++)
    for (let j = 0; j < len; j++)
    for (let k = 0; k < len; k++) {
      let s = str.replace(/\$primitive\$/g, primitives[i])
                 .replace(/\$primitiveFmt\$/g, capPrimitives[i])
                 .replace(/\$primitive2\$/g, primitives[j])
                 .replace(/\$primitiveFmt2\$/g, capPrimitives[j])
                 .replace(/\$primitive3\$/g, primitives[k])
                 .replace(/\$primitiveFmt3\$/g, capPrimitives[k]);

      let f = file.replace(/\$primitive\$/g, primitives[i])
                  .replace(/\$primitiveFmt\$/g, capPrimitives[i])
                  .replace(/\$primitive2\$/g, primitives[j])
                  .replace(/\$primitiveFmt2\$/g, capPrimitives[j])
                  .replace(/\$primitive3\$/g, primitives[k])
                  .replace(/\$primitiveFmt3\$/g, capPrimitives[k]);

      fs.writeFileSync('./src/main/java/fallk/grove/' + f, s);
    }

  }*/
}