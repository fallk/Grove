// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TCharObjectIterator;
import gnu.trove.map.TCharObjectMap;
import gnu.trove.map.hash.TCharObjectHashMap;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// char = byte, char, etc.
// C = B, C, etc.
// Char = Byte, Char, etc.
// Character = Byte, Character, etc.
// Character, Character = Byte, Character, etc. but Int instead of Integer
// Grove.parseChar = Byte.parseByte, Integer.parseInt, Grove.parseChar
final class GroveMapCharObject implements JsonSerializer<TCharObjectMap<Object>>, JsonDeserializer<TCharObjectMap<Object>> {
    public static final GroveMapCharObject INSTANCE = new GroveMapCharObject();
    private GroveMapCharObject() {}

    public TCharObjectMap<Object> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TCharObjectMap<Object> map = new TCharObjectHashMap<>(jmap.size());

        Type genericType = Grove.getGenericType(typeOfT);

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Grove.parseChar(el.getKey()), context.deserialize(el.getValue(), genericType));
        }
        return map;
    }

    public JsonElement serialize(TCharObjectMap<Object> src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        Type genericType = Grove.getGenericType(typeOfSrc);

        for (TCharObjectIterator<Object> iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.add(Character.toString(iterator.key()), context.serialize(iterator.value(), genericType));
        }

        return jmap;
    }
}