// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TCharCharIterator;
import gnu.trove.map.TCharCharMap;
import gnu.trove.map.hash.TCharCharHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// char, char = byte, char, etc.
// C, C = B, C, etc.
// Char, Char = Byte, Char, etc.
// Character, Character = Byte, Character, etc.
// Character, Character = Byte, Character, etc. but Int instead of Integer
// Grove.parseChar = Byte.parseByte, Integer.parseInt, Grove.parseChar
// CharChar = ByteByte, ByteChar, etc.
final class GroveMapCharChar implements JsonSerializer<TCharCharMap>, JsonDeserializer<TCharCharMap> {
    public static final GroveMapCharChar INSTANCE = new GroveMapCharChar();
    private GroveMapCharChar() {}

    public TCharCharMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TCharCharMap map = new TCharCharHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Grove.parseChar(el.getKey()), el.getValue().getAsCharacter());
        }
        return map;
    }

    public JsonElement serialize(TCharCharMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TCharCharIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Character.toString(iterator.key()), Character.toString(iterator.value()));
        }

        return jmap;
    }
}