// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TFloatByteIterator;
import gnu.trove.map.TFloatByteMap;
import gnu.trove.map.hash.TFloatByteHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// float, byte = byte, char, etc.
// F, B = B, C, etc.
// Float, Byte = Byte, Char, etc.
// Float, Byte = Byte, Character, etc.
// Float, Byte = Byte, Character, etc. but Int instead of Integer
// Float.parseFloat = Byte.parseByte, Integer.parseInt, Grove.parseChar
// FloatByte = ByteByte, ByteChar, etc.
final class GroveMapFloatByte implements JsonSerializer<TFloatByteMap>, JsonDeserializer<TFloatByteMap> {
    public static final GroveMapFloatByte INSTANCE = new GroveMapFloatByte();
    private GroveMapFloatByte() {}

    public TFloatByteMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TFloatByteMap map = new TFloatByteHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Float.parseFloat(el.getKey()), el.getValue().getAsByte());
        }
        return map;
    }

    public JsonElement serialize(TFloatByteMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TFloatByteIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Float.toString(iterator.key()), Byte.toString(iterator.value()));
        }

        return jmap;
    }
}