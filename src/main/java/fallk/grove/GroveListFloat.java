// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.list.array.TFloatArrayList;
import gnu.trove.list.TFloatList;

import java.lang.reflect.Type;

// Tokens:
// float = byte, char, etc.
// F = B, C, etc.
// Float = Byte, Char, etc.
// Float = Byte, Character, etc.
// Float = Byte, Character, etc. but Int instead of Integer
final class GroveListFloat implements JsonSerializer<TFloatList>, JsonDeserializer<TFloatList> {
    public static final GroveListFloat INSTANCE = new GroveListFloat();
    private GroveListFloat() {}

    public TFloatList deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonArray arr = json.getAsJsonArray();
        TFloatArrayList ls = new TFloatArrayList(arr.size());
        for (JsonElement el : arr) {
            ls.add(el.getAsFloat());
        }
        return ls;
    }

    public JsonElement serialize(TFloatList src, Type typeOfSrc, JsonSerializationContext context) {
        JsonArray arr = new JsonArray();
        for (int i = 0, len = src.size(); i < len; i++) {
            arr.add(Float.toString(src.get(i)));
        }
        return arr;
    }
}