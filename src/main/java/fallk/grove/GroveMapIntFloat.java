// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TIntFloatIterator;
import gnu.trove.map.TIntFloatMap;
import gnu.trove.map.hash.TIntFloatHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// int, float = byte, char, etc.
// I, F = B, C, etc.
// Int, Float = Byte, Char, etc.
// Integer, Float = Byte, Character, etc.
// Int, Float = Byte, Character, etc. but Int instead of Integer
// Integer.parseInt = Byte.parseByte, Integer.parseInt, Grove.parseChar
// IntFloat = ByteByte, ByteChar, etc.
final class GroveMapIntFloat implements JsonSerializer<TIntFloatMap>, JsonDeserializer<TIntFloatMap> {
    public static final GroveMapIntFloat INSTANCE = new GroveMapIntFloat();
    private GroveMapIntFloat() {}

    public TIntFloatMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TIntFloatMap map = new TIntFloatHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Integer.parseInt(el.getKey()), el.getValue().getAsFloat());
        }
        return map;
    }

    public JsonElement serialize(TIntFloatMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TIntFloatIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Integer.toString(iterator.key()), Float.toString(iterator.value()));
        }

        return jmap;
    }
}