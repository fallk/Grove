// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.lang.reflect.Type;
import java.util.Map.Entry;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import gnu.trove.decorator.T$primitiveFmt$SetDecorator;
import gnu.trove.map.T$primitiveFmt$ObjectMap;
import gnu.trove.map.hash.T$primitiveFmt$ObjectHashMap;

//$primitive$
public final class Trove$primitiveFmt$ObjectMapTypeAdapter<V> implements JsonSerializer<T$primitiveFmt$ObjectMap<V>>, JsonDeserializer<T$primitiveFmt$ObjectMap<V>> {
    // guava says to implement this differently, check doc if this dosnt work

    //@SuppressWarnings("unchecked")
    public T$primitiveFmt$ObjectMap<V> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        T$primitiveFmt$ObjectMap<V> map = new T$primitiveFmt$ObjectHashMap<>(jmap.size());
        
//        TypeToken<V> typeToken = new TypeToken<V>(getClass()) {private static final long serialVersionUID = 4330662962912411095L;};
//        Type genericType = typeToken.getType(); // or getRawType() to return Class<? super T>

        Type genericType = getGenericType(typeOfT);
        
        System.out.println("generic: "+ genericType);
        
        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            if (el.getKey().equals("__vtyp__")) continue;
            map.put($primitiveFmt$.parse$primitiveFmt$(el.getKey()), context.deserialize(el.getValue(), genericType));
        }
        return map;
    }

    private static final Type getGenericType(Type typeOfT) {
        String s = typeOfT.toString();
        int start = s.lastIndexOf('<');
        int end = s.lastIndexOf('>');
        if (end == -1 || start == -1) throw new JsonParseException("When deserializing Trove maps with Grove, either enclose your map in an instance or use a TypeToken as detailed in the Gson documentation.");
        try {
            return Class.forName(s.substring(start+1, end));
        } catch (ClassNotFoundException e) {
            throw new JsonParseException("Attempted to deserialize Trove map with generic type parameter that does not exist. This should never happen.", e);
        }
    }

    public JsonElement serialize(T$primitiveFmt$ObjectMap<V> src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        T$primitiveFmt$SetDecorator keys = new T$primitiveFmt$SetDecorator(src.keySet());

        System.out.println("src:"+typeOfSrc);
        
        for ($primitive$ key : keys) {
            jmap.add($primitiveFmt$.toString(key), context.serialize(src.get(key), getGenericType(typeOfSrc)));
        }
        return jmap;
    }
}