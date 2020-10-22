// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TFloatFloatIterator;
import gnu.trove.map.TFloatFloatMap;
import gnu.trove.map.hash.TFloatFloatHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// float, float = byte, char, etc.
// F, F = B, C, etc.
// Float, Float = Byte, Char, etc.
// Float, Float = Byte, Character, etc.
// Float, Float = Byte, Character, etc. but Int instead of Integer
// Float.parseFloat = Byte.parseByte, Integer.parseInt, Grove.parseChar
// FloatFloat = ByteByte, ByteChar, etc.
final class GroveMapFloatFloat implements JsonSerializer<TFloatFloatMap>, JsonDeserializer<TFloatFloatMap> {
    public static final GroveMapFloatFloat INSTANCE = new GroveMapFloatFloat();
    private GroveMapFloatFloat() {}

    public TFloatFloatMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TFloatFloatMap map = new TFloatFloatHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Float.parseFloat(el.getKey()), el.getValue().getAsFloat());
        }
        return map;
    }

    public JsonElement serialize(TFloatFloatMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TFloatFloatIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Float.toString(iterator.key()), Float.toString(iterator.value()));
        }

        return jmap;
    }
}