// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TShortObjectIterator;
import gnu.trove.map.TShortObjectMap;
import gnu.trove.map.hash.TShortObjectHashMap;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// short = byte, char, etc.
// S = B, C, etc.
// Short = Byte, Char, etc.
// Short = Byte, Character, etc.
// Short, Character = Byte, Character, etc. but Int instead of Integer
// Short.parseShort = Byte.parseByte, Integer.parseInt, Grove.parseChar
final class GroveMapShortObject implements JsonSerializer<TShortObjectMap<Object>>, JsonDeserializer<TShortObjectMap<Object>> {
    public static final GroveMapShortObject INSTANCE = new GroveMapShortObject();
    private GroveMapShortObject() {}

    public TShortObjectMap<Object> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TShortObjectMap<Object> map = new TShortObjectHashMap<>(jmap.size());

        Type genericType = Grove.getGenericType(typeOfT);

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Short.parseShort(el.getKey()), context.deserialize(el.getValue(), genericType));
        }
        return map;
    }

    public JsonElement serialize(TShortObjectMap<Object> src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        Type genericType = Grove.getGenericType(typeOfSrc);

        for (TShortObjectIterator<Object> iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.add(Short.toString(iterator.key()), context.serialize(iterator.value(), genericType));
        }

        return jmap;
    }
}