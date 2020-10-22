// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.T$keyShrt$ObjectIterator;
import gnu.trove.map.T$keyShrt$ObjectMap;
import gnu.trove.map.hash.T$keyShrt$ObjectHashMap;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// $keyPrim$ = byte, char, etc.
// $keyName$ = B, C, etc.
// $keyShrt$ = Byte, Char, etc.
// $keyLong$ = Byte, Character, etc.
// $keyLongGson$, $valLongGson$ = Byte, Character, etc. but Int instead of Integer
// $keySpecialCaseParse$ = Byte.parseByte, Integer.parseInt, Grove.parseChar
final class GroveMap$keyShrt$Object implements JsonSerializer<T$keyShrt$ObjectMap<Object>>, JsonDeserializer<T$keyShrt$ObjectMap<Object>> {
    public static final GroveMap$keyShrt$Object INSTANCE = new GroveMap$keyShrt$Object();
    private GroveMap$keyShrt$Object() {}

    public T$keyShrt$ObjectMap<Object> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        T$keyShrt$ObjectMap<Object> map = new T$keyShrt$ObjectHashMap<>(jmap.size());

        Type genericType = Grove.getGenericType(typeOfT);

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put($keySpecialCaseParse$(el.getKey()), context.deserialize(el.getValue(), genericType));
        }
        return map;
    }

    public JsonElement serialize(T$keyShrt$ObjectMap<Object> src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        Type genericType = Grove.getGenericType(typeOfSrc);

        for (T$keyShrt$ObjectIterator<Object> iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.add($keyLong$.toString(iterator.key()), context.serialize(iterator.value(), genericType));
        }

        return jmap;
    }
}