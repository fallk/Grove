// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TByteDoubleIterator;
import gnu.trove.map.TByteDoubleMap;
import gnu.trove.map.hash.TByteDoubleHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// byte, double = byte, char, etc.
// B, D = B, C, etc.
// Byte, Double = Byte, Char, etc.
// Byte, Double = Byte, Character, etc.
// Byte, Double = Byte, Character, etc. but Int instead of Integer
// Byte.parseByte = Byte.parseByte, Integer.parseInt, Grove.parseChar
// ByteDouble = ByteByte, ByteChar, etc.
final class GroveMapByteDouble implements JsonSerializer<TByteDoubleMap>, JsonDeserializer<TByteDoubleMap> {
    public static final GroveMapByteDouble INSTANCE = new GroveMapByteDouble();
    private GroveMapByteDouble() {}

    public TByteDoubleMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TByteDoubleMap map = new TByteDoubleHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Byte.parseByte(el.getKey()), el.getValue().getAsDouble());
        }
        return map;
    }

    public JsonElement serialize(TByteDoubleMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TByteDoubleIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Byte.toString(iterator.key()), Double.toString(iterator.value()));
        }

        return jmap;
    }
}