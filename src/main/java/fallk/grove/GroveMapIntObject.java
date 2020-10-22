// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntObjectHashMap;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// int = byte, char, etc.
// I = B, C, etc.
// Int = Byte, Char, etc.
// Integer = Byte, Character, etc.
// Int, Character = Byte, Character, etc. but Int instead of Integer
// Integer.parseInt = Byte.parseByte, Integer.parseInt, Grove.parseChar
final class GroveMapIntObject implements JsonSerializer<TIntObjectMap<Object>>, JsonDeserializer<TIntObjectMap<Object>> {
    public static final GroveMapIntObject INSTANCE = new GroveMapIntObject();
    private GroveMapIntObject() {}

    public TIntObjectMap<Object> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TIntObjectMap<Object> map = new TIntObjectHashMap<>(jmap.size());

        Type genericType = Grove.getGenericType(typeOfT);

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Integer.parseInt(el.getKey()), context.deserialize(el.getValue(), genericType));
        }
        return map;
    }

    public JsonElement serialize(TIntObjectMap<Object> src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        Type genericType = Grove.getGenericType(typeOfSrc);

        for (TIntObjectIterator<Object> iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.add(Integer.toString(iterator.key()), context.serialize(iterator.value(), genericType));
        }

        return jmap;
    }
}