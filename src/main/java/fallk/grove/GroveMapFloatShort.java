// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TFloatShortIterator;
import gnu.trove.map.TFloatShortMap;
import gnu.trove.map.hash.TFloatShortHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// float, short = byte, char, etc.
// F, S = B, C, etc.
// Float, Short = Byte, Char, etc.
// Float, Short = Byte, Character, etc.
// Float, Short = Byte, Character, etc. but Int instead of Integer
// Float.parseFloat = Byte.parseByte, Integer.parseInt, Grove.parseChar
// FloatShort = ByteByte, ByteChar, etc.
final class GroveMapFloatShort implements JsonSerializer<TFloatShortMap>, JsonDeserializer<TFloatShortMap> {
    public static final GroveMapFloatShort INSTANCE = new GroveMapFloatShort();
    private GroveMapFloatShort() {}

    public TFloatShortMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TFloatShortMap map = new TFloatShortHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Float.parseFloat(el.getKey()), el.getValue().getAsShort());
        }
        return map;
    }

    public JsonElement serialize(TFloatShortMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TFloatShortIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Float.toString(iterator.key()), Short.toString(iterator.value()));
        }

        return jmap;
    }
}