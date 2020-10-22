// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TLongByteIterator;
import gnu.trove.map.TLongByteMap;
import gnu.trove.map.hash.TLongByteHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// long, byte = byte, char, etc.
// L, B = B, C, etc.
// Long, Byte = Byte, Char, etc.
// Long, Byte = Byte, Character, etc.
// Long, Byte = Byte, Character, etc. but Int instead of Integer
// Long.parseLong = Byte.parseByte, Integer.parseInt, Grove.parseChar
// LongByte = ByteByte, ByteChar, etc.
final class GroveMapLongByte implements JsonSerializer<TLongByteMap>, JsonDeserializer<TLongByteMap> {
    public static final GroveMapLongByte INSTANCE = new GroveMapLongByte();
    private GroveMapLongByte() {}

    public TLongByteMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TLongByteMap map = new TLongByteHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Long.parseLong(el.getKey()), el.getValue().getAsByte());
        }
        return map;
    }

    public JsonElement serialize(TLongByteMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TLongByteIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Long.toString(iterator.key()), Byte.toString(iterator.value()));
        }

        return jmap;
    }
}