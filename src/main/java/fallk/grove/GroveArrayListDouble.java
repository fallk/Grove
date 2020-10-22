// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.list.array.TDoubleArrayList;

import java.lang.reflect.Type;

// Tokens:
// double = byte, char, etc.
// D = B, C, etc.
// Double = Byte, Char, etc.
// Double = Byte, Character, etc.
// Double = Byte, Character, etc. but Int instead of Integer
final class GroveArrayListDouble implements JsonSerializer<TDoubleArrayList>, JsonDeserializer<TDoubleArrayList> {
    public static final GroveArrayListDouble INSTANCE = new GroveArrayListDouble();
    private GroveArrayListDouble() {}

    public TDoubleArrayList deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonArray arr = json.getAsJsonArray();
        TDoubleArrayList ls = new TDoubleArrayList(arr.size());
        for (JsonElement el : arr) {
            ls.add(el.getAsDouble());
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