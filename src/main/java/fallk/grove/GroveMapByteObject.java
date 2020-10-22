// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TByteObjectIterator;
import gnu.trove.map.TByteObjectMap;
import gnu.trove.map.hash.TByteObjectHashMap;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// byte = byte, char, etc.
// B = B, C, etc.
// Byte = Byte, Char, etc.
// Byte = Byte, Character, etc.
// Byte, Character = Byte, Character, etc. but Int instead of Integer
// Byte.parseByte = Byte.parseByte, Integer.parseInt, Grove.parseChar
final class GroveMapByteObject implements JsonSerializer<TByteObjectMap<Object>>, JsonDeserializer<TByteObjectMap<Object>> {
    public static final GroveMapByteObject INSTANCE = new GroveMapByteObject();
    private GroveMapByteObject() {}

    public TByteObjectMap<Object> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TByteObjectMap<Object> map = new TByteObjectHashMap<>(jmap.size());

        Type genericType = Grove.getGenericType(typeOfT);

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Byte.parseByte(el.getKey()), context.deserialize(el.getValue(), genericType));
        }
        return map;
    }

    public JsonElement serialize(TByteObjectMap<Object> src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        Type genericType = Grove.getGenericType(typeOfSrc);

        for (TByteObjectIterator<Object> iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.add(Byte.toString(iterator.key()), context.serialize(iterator.value(), genericType));
        }

        return jmap;
    }
}