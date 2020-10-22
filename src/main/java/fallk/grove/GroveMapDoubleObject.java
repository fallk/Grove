// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TDoubleObjectIterator;
import gnu.trove.map.TDoubleObjectMap;
import gnu.trove.map.hash.TDoubleObjectHashMap;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// double = byte, char, etc.
// D = B, C, etc.
// Double = Byte, Char, etc.
// Double = Byte, Character, etc.
// Double, Character = Byte, Character, etc. but Int instead of Integer
// Double.parseDouble = Byte.parseByte, Integer.parseInt, Grove.parseChar
final class GroveMapDoubleObject implements JsonSerializer<TDoubleObjectMap<Object>>, JsonDeserializer<TDoubleObjectMap<Object>> {
    public static final GroveMapDoubleObject INSTANCE = new GroveMapDoubleObject();
    private GroveMapDoubleObject() {}

    public TDoubleObjectMap<Object> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TDoubleObjectMap<Object> map = new TDoubleObjectHashMap<>(jmap.size());

        Type genericType = Grove.getGenericType(typeOfT);

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Double.parseDouble(el.getKey()), context.deserialize(el.getValue(), genericType));
        }
        return map;
    }

    public JsonElement serialize(TDoubleObjectMap<Object> src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        Type genericType = Grove.getGenericType(typeOfSrc);

        for (TDoubleObjectIterator<Object> iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.add(Double.toString(iterator.key()), context.serialize(iterator.value(), genericType));
        }

        return jmap;
    }
}