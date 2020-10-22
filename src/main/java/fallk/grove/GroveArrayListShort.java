// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.list.array.TShortArrayList;

import java.lang.reflect.Type;

// Tokens:
// short = byte, char, etc.
// S = B, C, etc.
// Short = Byte, Char, etc.
// Short = Byte, Character, etc.
// Short = Byte, Character, etc. but Int instead of Integer
final class GroveArrayListShort implements JsonSerializer<TShortArrayList>, JsonDeserializer<TShortArrayList> {
    public static final GroveArrayListShort INSTANCE = new GroveArrayListShort();
    private GroveArrayListShort() {}

    public TShortArrayList deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonArray arr = json.getAsJsonArray();
        TShortArrayList ls = new TShortArrayList(arr.size());
        for (JsonElement el : arr) {
            ls.add(el.getAsShort());
        }
        return ls;
    }

    public JsonElement serialize(TShortArrayList src, Type typeOfSrc, JsonSerializationContext context) {
        JsonArray arr = new JsonArray();
        for (int i = 0, len = src.size(); i < len; i++) {
            arr.add(Short.toString(src.get(i)));
        }
        return arr;
    }
}