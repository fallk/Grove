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

import gnu.trove.list.TShortList;
import gnu.trove.list.array.TShortArrayList;

//short
/**
 * structure:
 * <pre> [
 *   [{@literal <}elements as array>],
 *   "full.type.name"
 * ]</pre>
 * this class will use {@link TroveShortArrayListTypeAdapter} when possible
 * 
 * @author Rafael
 */
public final class TroveShortListGenericTypeAdapter implements JsonSerializer<TShortList>, JsonDeserializer<TShortList> {
    public TShortList deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonArray arr = json.getAsJsonArray();
        String arrType = arr.get(1).getAsString();
        if (arrType.equals("gnu.trove.list.array.TShortArrayList")) {
            return Adapters.shortAdapter.deserialize(json, null, null);
        } else {
            try {
                @SuppressWarnings("unchecked")
                Class<? extends TShortList> cl = (Class<? extends TShortList>) Class.forName(arrType);
                
                TShortList list = cl.getConstructor().newInstance();
                arr.get(0).getAsJsonArray().forEach(el -> {
                    list.add(Convert.getAsShort(el));
                });
                return list;
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public JsonElement serialize(TShortList src, Type typeOfSrc, JsonSerializationContext context) {
        JsonArray arr;
        
        if (src instanceof TShortArrayList) {
            arr = (JsonArray) Adapters.shortAdapter.serialize((TShortArrayList) src, null, null);
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