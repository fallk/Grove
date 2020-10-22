// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TDoubleByteIterator;
import gnu.trove.map.TDoubleByteMap;
import gnu.trove.map.hash.TDoubleByteHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// double, byte = byte, char, etc.
// D, B = B, C, etc.
// Double, Byte = Byte, Char, etc.
// Double, Byte = Byte, Character, etc.
// Double, Byte = Byte, Character, etc. but Int instead of Integer
// Double.parseDouble = Byte.parseByte, Integer.parseInt, Grove.parseChar
// DoubleByte = ByteByte, ByteChar, etc.
final class GroveMapDoubleByte implements JsonSerializer<TDoubleByteMap>, JsonDeserializer<TDoubleByteMap> {
    public static final GroveMapDoubleByte INSTANCE = new GroveMapDoubleByte();
    private GroveMapDoubleByte() {}

    public TDoubleByteMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TDoubleByteMap map = new TDoubleByteHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Double.parseDouble(el.getKey()), el.getValue().getAsByte());
        }
        return map;
    }

    public JsonElement serialize(TDoubleByteMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TDoubleByteIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Double.toString(iterator.key()), Byte.toString(iterator.value()));
        }

        return jmap;
    }
}