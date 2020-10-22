// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TLongDoubleIterator;
import gnu.trove.map.TLongDoubleMap;
import gnu.trove.map.hash.TLongDoubleHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// long, double = byte, char, etc.
// L, D = B, C, etc.
// Long, Double = Byte, Char, etc.
// Long, Double = Byte, Character, etc.
// Long, Double = Byte, Character, etc. but Int instead of Integer
// Long.parseLong = Byte.parseByte, Integer.parseInt, Grove.parseChar
// LongDouble = ByteByte, ByteChar, etc.
final class GroveMapLongDouble implements JsonSerializer<TLongDoubleMap>, JsonDeserializer<TLongDoubleMap> {
    public static final GroveMapLongDouble INSTANCE = new GroveMapLongDouble();
    private GroveMapLongDouble() {}

    public TLongDoubleMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TLongDoubleMap map = new TLongDoubleHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Long.parseLong(el.getKey()), el.getValue().getAsDouble());
        }
        return map;
    }

    public JsonElement serialize(TLongDoubleMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TLongDoubleIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Long.toString(iterator.key()), Double.toString(iterator.value()));
        }

        return jmap;
    }
}