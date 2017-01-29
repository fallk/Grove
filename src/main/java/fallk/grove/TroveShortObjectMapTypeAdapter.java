// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.lang.reflect.Type;
import java.util.Map.Entry;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import gnu.trove.decorator.TShortSetDecorator;
import gnu.trove.map.TShortObjectMap;
import gnu.trove.map.hash.TShortObjectHashMap;

//short
public final class TroveShortObjectMapTypeAdapter<V> implements JsonSerializer<TShortObjectMap<V>>, JsonDeserializer<TShortObjectMap<V>> {
    // guava says to implement this differently, check doc if this dosnt work

    //@SuppressWarnings("unchecked")
    public TShortObjectMap<V> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TShortObjectMap<V> map = new TShortObjectHashMap<>(jmap.size());
        
//        TypeToken<V> typeToken = new TypeToken<V>(getClass()) {private static final long serialVersionUID = 4330662962912411095L;};
//        Type genericType = typeToken.getType(); // or getRawType() to return Class<? super T>

        Type genericType = getGenericType(typeOfT);
        
        System.out.println("generic: "+ genericType);
        
        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            if (el.getKey().equals("__vtyp__")) continue;
            map.put(Short.parseShort(el.getKey()), context.deserialize(el.getValue(), genericType));
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

    public JsonElement serialize(TShortObjectMap<V> src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        TShortSetDecorator keys = new TShortSetDecorator(src.keySet());

        System.out.println("src:"+typeOfSrc);
        
        for (short key : keys) {
            jmap.add(Short.toString(key), context.serialize(src.get(key), getGenericType(typeOfSrc)));
        }
        return jmap;
    }
}