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

import gnu.trove.list.TCharList;
import gnu.trove.list.array.TCharArrayList;

//char
/**
 * structure:
 * <pre> [
 *   [{@literal <}elements as array>],
 *   "full.type.name"
 * ]</pre>
 * this class will use {@link TroveCharArrayListTypeAdapter} when possible
 * 
 * @author Rafael
 */
public final class TroveCharListGenericTypeAdapter implements JsonSerializer<TCharList>, JsonDeserializer<TCharList> {
    public TCharList deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonArray arr = json.getAsJsonArray();
        String arrType = arr.get(1).getAsString();
        if (arrType.equals("gnu.trove.list.array.TCharArrayList")) {
            return Adapters.charAdapter.deserialize(json, null, null);
        } else {
            try {
                @SuppressWarnings("unchecked")
                Class<? extends TCharList> cl = (Class<? extends TCharList>) Class.forName(arrType);
                
                TCharList list = cl.getConstructor().newInstance();
                arr.get(0).getAsJsonArray().forEach(el -> {
                    list.add(Convert.getAsChar(el));
                });
                return list;
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public JsonElement serialize(TCharList src, Type typeOfSrc, JsonSerializationContext context) {
        JsonArray arr;
        
        if (src instanceof TCharArrayList) {
            arr = (JsonArray) Adapters.charAdapter.serialize((TCharArrayList) src, null, null);
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