// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TLongFloatIterator;
import gnu.trove.map.TLongFloatMap;
import gnu.trove.map.hash.TLongFloatHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// long, float = byte, char, etc.
// L, F = B, C, etc.
// Long, Float = Byte, Char, etc.
// Long, Float = Byte, Character, etc.
// Long, Float = Byte, Character, etc. but Int instead of Integer
// Long.parseLong = Byte.parseByte, Integer.parseInt, Grove.parseChar
// LongFloat = ByteByte, ByteChar, etc.
final class GroveMapLongFloat implements JsonSerializer<TLongFloatMap>, JsonDeserializer<TLongFloatMap> {
    public static final GroveMapLongFloat INSTANCE = new GroveMapLongFloat();
    private GroveMapLongFloat() {}

    public TLongFloatMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TLongFloatMap map = new TLongFloatHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Long.parseLong(el.getKey()), el.getValue().getAsFloat());
        }
        return map;
    }

    public JsonElement serialize(TLongFloatMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TLongFloatIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Long.toString(iterator.key()), Float.toString(iterator.value()));
        }

        return jmap;
    }
}