// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.lang.reflect.Type;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import gnu.trove.list.array.T$primitiveFmt$ArrayList;

//$primitive$
public final class Trove$primitiveFmt$ArrayListTypeAdapter implements JsonSerializer<T$primitiveFmt$ArrayList>, JsonDeserializer<T$primitiveFmt$ArrayList> {
    public T$primitiveFmt$ArrayList deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonArray arr = json.getAsJsonArray();
        T$primitiveFmt$ArrayList ls = new T$primitiveFmt$ArrayList(arr.size());
        for (JsonElement el : arr) {
            ls.add($primitiveFmt$.parse$primitiveFmt$(el.getAsString()));
        }
        return ls;
    }

    public JsonElement serialize(T$primitiveFmt$ArrayList src, Type typeOfSrc, JsonSerializationContext context) {
        JsonArray arr = new JsonArray();
        for (int i = 0, len = src.size(); i < len; i++) {
            arr.add($primitiveN$.toString(src.get(i)));
        }
        return arr;
    }
}