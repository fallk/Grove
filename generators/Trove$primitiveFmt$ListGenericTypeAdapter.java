// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import gnu.trove.list.T$primitiveFmt$List;
import gnu.trove.list.array.T$primitiveFmt$ArrayList;

//$primitive$
/**
 * structure:
 * <pre> [
 *   [{@literal <}elements as array>],
 *   "full.type.name"
 * ]</pre>
 * this class will use {@link Trove$primitiveFmt$ArrayListTypeAdapter} when possible
 * 
 * @author Rafael
 */
public final class Trove$primitiveFmt$ListGenericTypeAdapter implements JsonSerializer<T$primitiveFmt$List>, JsonDeserializer<T$primitiveFmt$List> {
    public T$primitiveFmt$List deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonArray arr = json.getAsJsonArray();
        String arrType = arr.get(1).getAsString();
        if (arrType.equals("gnu.trove.list.array.T$primitiveFmt$ArrayList")) {
            return Adapters.$primitive$Adapter.deserialize(json, null, null);
        } else {
            try {
                @SuppressWarnings("unchecked")
                Class<? extends T$primitiveFmt$List> cl = (Class<? extends T$primitiveFmt$List>) Class.forName(arrType);
                
                T$primitiveFmt$List list = cl.getConstructor().newInstance();
                arr.get(0).getAsJsonArray().forEach(el -> {
                    list.add(Convert.getAs$primitiveFmt$(el));
                });
                return list;
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public JsonElement serialize(T$primitiveFmt$List src, Type typeOfSrc, JsonSerializationContext context) {
        JsonArray arr;
        
        if (src instanceof T$primitiveFmt$ArrayList) {
            arr = (JsonArray) Adapters.$primitive$Adapter.serialize((T$primitiveFmt$ArrayList) src, null, null);
        } else {
            arr = new JsonArray();
            src.forEach(l -> {
                arr.add(l);
                return true;
            });
        }
        
        JsonArray out = new JsonArray();
        out.add(arr);
        out.add(src.getClass().getName());
        return out;
    }
}