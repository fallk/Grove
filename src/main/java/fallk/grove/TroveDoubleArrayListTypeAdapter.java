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

import gnu.trove.list.array.TDoubleArrayList;

//double
public final class TroveDoubleArrayListTypeAdapter implements JsonSerializer<TDoubleArrayList>, JsonDeserializer<TDoubleArrayList> {
    public TDoubleArrayList deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonArray arr = json.getAsJsonArray();
        TDoubleArrayList ls = new TDoubleArrayList(arr.size());
        for (JsonElement el : arr) {
            ls.add(Double.parseDouble(el.getAsString()));
        }
        return ls;
    }

    public JsonElement serialize(TDoubleArrayList src, Type typeOfSrc, JsonSerializationContext context) {
        JsonArray arr = new JsonArray();
        for (int i = 0, len = src.size(); i < len; i++) {
            arr.add(Double.toString(src.get(i)));
        }
        return arr;
    }
}