// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TFloatObjectIterator;
import gnu.trove.map.TFloatObjectMap;
import gnu.trove.map.hash.TFloatObjectHashMap;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// float = byte, char, etc.
// F = B, C, etc.
// Float = Byte, Char, etc.
// Float = Byte, Character, etc.
// Float, Character = Byte, Character, etc. but Int instead of Integer
// Float.parseFloat = Byte.parseByte, Integer.parseInt, Grove.parseChar
final class GroveMapFloatObject implements JsonSerializer<TFloatObjectMap<Object>>, JsonDeserializer<TFloatObjectMap<Object>> {
    public static final GroveMapFloatObject INSTANCE = new GroveMapFloatObject();
    private GroveMapFloatObject() {}

    public TFloatObjectMap<Object> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TFloatObjectMap<Object> map = new TFloatObjectHashMap<>(jmap.size());

        Type genericType = Grove.getGenericType(typeOfT);

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Float.parseFloat(el.getKey()), context.deserialize(el.getValue(), genericType));
        }
        return map;
    }

    public JsonElement serialize(TFloatObjectMap<Object> src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        Type genericType = Grove.getGenericType(typeOfSrc);

        for (TFloatObjectIterator<Object> iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.add(Float.toString(iterator.key()), context.serialize(iterator.value(), genericType));
        }

        return jmap;
    }
}