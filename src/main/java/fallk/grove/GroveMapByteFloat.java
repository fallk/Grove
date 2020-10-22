// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TByteFloatIterator;
import gnu.trove.map.TByteFloatMap;
import gnu.trove.map.hash.TByteFloatHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// byte, float = byte, char, etc.
// B, F = B, C, etc.
// Byte, Float = Byte, Char, etc.
// Byte, Float = Byte, Character, etc.
// Byte, Float = Byte, Character, etc. but Int instead of Integer
// Byte.parseByte = Byte.parseByte, Integer.parseInt, Grove.parseChar
// ByteFloat = ByteByte, ByteChar, etc.
final class GroveMapByteFloat implements JsonSerializer<TByteFloatMap>, JsonDeserializer<TByteFloatMap> {
    public static final GroveMapByteFloat INSTANCE = new GroveMapByteFloat();
    private GroveMapByteFloat() {}

    public TByteFloatMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TByteFloatMap map = new TByteFloatHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Byte.parseByte(el.getKey()), el.getValue().getAsFloat());
        }
        return map;
    }

    public JsonElement serialize(TByteFloatMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TByteFloatIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Byte.toString(iterator.key()), Float.toString(iterator.value()));
        }

        return jmap;
    }
}