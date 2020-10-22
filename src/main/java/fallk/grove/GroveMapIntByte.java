// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TIntByteIterator;
import gnu.trove.map.TIntByteMap;
import gnu.trove.map.hash.TIntByteHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// int, byte = byte, char, etc.
// I, B = B, C, etc.
// Int, Byte = Byte, Char, etc.
// Integer, Byte = Byte, Character, etc.
// Int, Byte = Byte, Character, etc. but Int instead of Integer
// Integer.parseInt = Byte.parseByte, Integer.parseInt, Grove.parseChar
// IntByte = ByteByte, ByteChar, etc.
final class GroveMapIntByte implements JsonSerializer<TIntByteMap>, JsonDeserializer<TIntByteMap> {
    public static final GroveMapIntByte INSTANCE = new GroveMapIntByte();
    private GroveMapIntByte() {}

    public TIntByteMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TIntByteMap map = new TIntByteHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Integer.parseInt(el.getKey()), el.getValue().getAsByte());
        }
        return map;
    }

    public JsonElement serialize(TIntByteMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TIntByteIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Integer.toString(iterator.key()), Byte.toString(iterator.value()));
        }

        return jmap;
    }
}