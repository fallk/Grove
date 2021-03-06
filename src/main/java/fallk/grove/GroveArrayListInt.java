// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.list.array.TIntArrayList;

import java.lang.reflect.Type;

// Tokens:
// int = byte, char, etc.
// I = B, C, etc.
// Int = Byte, Char, etc.
// Integer = Byte, Character, etc.
// Int = Byte, Character, etc. but Int instead of Integer
final class GroveArrayListInt implements JsonSerializer<TIntArrayList>, JsonDeserializer<TIntArrayList> {
    public static final GroveArrayListInt INSTANCE = new GroveArrayListInt();
    private GroveArrayListInt() {}

    public TIntArrayList deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonArray arr = json.getAsJsonArray();
        TIntArrayList ls = new TIntArrayList(arr.size());
        for (JsonElement el : arr) {
            ls.add(el.getAsInt());
        }
        return ls;
    }

    public JsonElement serialize(TIntArrayList src, Type typeOfSrc, JsonSerializationContext context) {
        JsonArray arr = new JsonArray();
        for (int i = 0, len = src.size(); i < len; i++) {
            arr.add(Integer.toString(src.get(i)));
        }
        return arr;
    }
}