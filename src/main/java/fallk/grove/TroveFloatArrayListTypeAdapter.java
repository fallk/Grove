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

import gnu.trove.list.array.TFloatArrayList;

//float
public final class TroveFloatArrayListTypeAdapter implements JsonSerializer<TFloatArrayList>, JsonDeserializer<TFloatArrayList> {
    public TFloatArrayList deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonArray arr = json.getAsJsonArray();
        TFloatArrayList ls = new TFloatArrayList(arr.size());
        for (JsonElement el : arr) {
            ls.add(Float.parseFloat(el.getAsString()));
        }
        return ls;
    }

    public JsonElement serialize(TFloatArrayList src, Type typeOfSrc, JsonSerializationContext context) {
        JsonArray arr = new JsonArray();
        for (int i = 0, len = src.size(); i < len; i++) {
            arr.add(Float.toString(src.get(i)));
        }
        return arr;
    }
}