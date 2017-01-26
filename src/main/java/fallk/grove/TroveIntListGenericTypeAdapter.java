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

import gnu.trove.list.TIntList;
import gnu.trove.list.array.TIntArrayList;

//int
/**
 * structure:
 * <pre> [
 *   [{@literal <}elements as array>],
 *   "full.type.name"
 * ]</pre>
 * this class will use {@link TroveIntArrayListTypeAdapter} when possible
 * 
 * @author Rafael
 */
public final class TroveIntListGenericTypeAdapter implements JsonSerializer<TIntList>, JsonDeserializer<TIntList> {
    public TIntList deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonArray arr = json.getAsJsonArray();
        String arrType = arr.get(1).getAsString();
        if (arrType.equals("gnu.trove.list.array.TIntArrayList")) {
            return Adapters.intAdapter.deserialize(json, null, null);
        } else {
            try {
                @SuppressWarnings("unchecked")
                Class<? extends TIntList> cl = (Class<? extends TIntList>) Class.forName(arrType);
                
                TIntList list = cl.getConstructor().newInstance();
                arr.get(0).getAsJsonArray().forEach(el -> {
                    list.add(Convert.getAsInt(el));
                });
                return list;
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public JsonElement serialize(TIntList src, Type typeOfSrc, JsonSerializationContext context) {
        JsonArray arr;
        
        if (src instanceof TIntArrayList) {
            arr = (JsonArray) Adapters.intAdapter.serialize((TIntArrayList) src, null, null);
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