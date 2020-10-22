// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TFloatLongIterator;
import gnu.trove.map.TFloatLongMap;
import gnu.trove.map.hash.TFloatLongHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// float, long = byte, char, etc.
// F, L = B, C, etc.
// Float, Long = Byte, Char, etc.
// Float, Long = Byte, Character, etc.
// Float, Long = Byte, Character, etc. but Int instead of Integer
// Float.parseFloat = Byte.parseByte, Integer.parseInt, Grove.parseChar
// FloatLong = ByteByte, ByteChar, etc.
final class GroveMapFloatLong implements JsonSerializer<TFloatLongMap>, JsonDeserializer<TFloatLongMap> {
    public static final GroveMapFloatLong INSTANCE = new GroveMapFloatLong();
    private GroveMapFloatLong() {}

    public TFloatLongMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TFloatLongMap map = new TFloatLongHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Float.parseFloat(el.getKey()), el.getValue().getAsLong());
        }
        return map;
    }

    public JsonElement serialize(TFloatLongMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TFloatLongIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Float.toString(iterator.key()), Long.toString(iterator.value()));
        }

        return jmap;
    }
}