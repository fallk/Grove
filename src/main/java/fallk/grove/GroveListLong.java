// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.list.TLongList;

import java.lang.reflect.Type;

// Tokens:
// long = byte, char, etc.
// L = B, C, etc.
// Long = Byte, Char, etc.
// Long = Byte, Character, etc.
// Long = Byte, Character, etc. but Int instead of Integer
final class GroveListLong implements JsonSerializer<TLongList>, JsonDeserializer<TLongList> {
    public static final GroveListLong INSTANCE = new GroveListLong();
    private GroveListLong() {}

    public TLongList deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonArray arr = json.getAsJsonArray();
        TLongArrayList ls = new TLongArrayList(arr.size());
        for (JsonElement el : arr) {
            ls.add(el.getAsLong());
        }
        return ls;
    }

    public JsonElement serialize(TLongList src, Type typeOfSrc, JsonSerializationContext context) {
        JsonArray arr = new JsonArray();
        for (int i = 0, len = src.size(); i < len; i++) {
            arr.add(Long.toString(src.get(i)));
        }
        return arr;
    }
}