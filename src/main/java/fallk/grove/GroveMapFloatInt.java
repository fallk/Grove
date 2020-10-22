// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TFloatIntIterator;
import gnu.trove.map.TFloatIntMap;
import gnu.trove.map.hash.TFloatIntHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// float, int = byte, char, etc.
// F, I = B, C, etc.
// Float, Int = Byte, Char, etc.
// Float, Integer = Byte, Character, etc.
// Float, Int = Byte, Character, etc. but Int instead of Integer
// Float.parseFloat = Byte.parseByte, Integer.parseInt, Grove.parseChar
// FloatInt = ByteByte, ByteChar, etc.
final class GroveMapFloatInt implements JsonSerializer<TFloatIntMap>, JsonDeserializer<TFloatIntMap> {
    public static final GroveMapFloatInt INSTANCE = new GroveMapFloatInt();
    private GroveMapFloatInt() {}

    public TFloatIntMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TFloatIntMap map = new TFloatIntHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Float.parseFloat(el.getKey()), el.getValue().getAsInt());
        }
        return map;
    }

    public JsonElement serialize(TFloatIntMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TFloatIntIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Float.toString(iterator.key()), Integer.toString(iterator.value()));
        }

        return jmap;
    }
}