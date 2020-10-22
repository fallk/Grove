// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TByteByteIterator;
import gnu.trove.map.TByteByteMap;
import gnu.trove.map.hash.TByteByteHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// byte, byte = byte, char, etc.
// B, B = B, C, etc.
// Byte, Byte = Byte, Char, etc.
// Byte, Byte = Byte, Character, etc.
// Byte, Byte = Byte, Character, etc. but Int instead of Integer
// Byte.parseByte = Byte.parseByte, Integer.parseInt, Grove.parseChar
// ByteByte = ByteByte, ByteChar, etc.
final class GroveMapByteByte implements JsonSerializer<TByteByteMap>, JsonDeserializer<TByteByteMap> {
    public static final GroveMapByteByte INSTANCE = new GroveMapByteByte();
    private GroveMapByteByte() {}

    public TByteByteMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TByteByteMap map = new TByteByteHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Byte.parseByte(el.getKey()), el.getValue().getAsByte());
        }
        return map;
    }

    public JsonElement serialize(TByteByteMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TByteByteIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Byte.toString(iterator.key()), Byte.toString(iterator.value()));
        }

        return jmap;
    }
}