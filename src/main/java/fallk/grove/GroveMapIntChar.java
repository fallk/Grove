// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TIntCharIterator;
import gnu.trove.map.TIntCharMap;
import gnu.trove.map.hash.TIntCharHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// int, char = byte, char, etc.
// I, C = B, C, etc.
// Int, Char = Byte, Char, etc.
// Integer, Character = Byte, Character, etc.
// Int, Character = Byte, Character, etc. but Int instead of Integer
// Integer.parseInt = Byte.parseByte, Integer.parseInt, Grove.parseChar
// IntChar = ByteByte, ByteChar, etc.
final class GroveMapIntChar implements JsonSerializer<TIntCharMap>, JsonDeserializer<TIntCharMap> {
    public static final GroveMapIntChar INSTANCE = new GroveMapIntChar();
    private GroveMapIntChar() {}

    public TIntCharMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TIntCharMap map = new TIntCharHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Integer.parseInt(el.getKey()), el.getValue().getAsCharacter());
        }
        return map;
    }

    public JsonElement serialize(TIntCharMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TIntCharIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Integer.toString(iterator.key()), Character.toString(iterator.value()));
        }

        return jmap;
    }
}