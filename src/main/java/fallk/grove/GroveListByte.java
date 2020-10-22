// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.list.array.TByteArrayList;
import gnu.trove.list.TByteList;

import java.lang.reflect.Type;

// Tokens:
// byte = byte, char, etc.
// B = B, C, etc.
// Byte = Byte, Char, etc.
// Byte = Byte, Character, etc.
// Byte = Byte, Character, etc. but Int instead of Integer
final class GroveListByte implements JsonSerializer<TByteList>, JsonDeserializer<TByteList> {
    public static final GroveListByte INSTANCE = new GroveListByte();
    private GroveListByte() {}

    public TByteList deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonArray arr = json.getAsJsonArray();
        TByteArrayList ls = new TByteArrayList(arr.size());
        for (JsonElement el : arr) {
            ls.add(el.getAsByte());
        }
        return ls;
    }

    public JsonElement serialize(TByteList src, Type typeOfSrc, JsonSerializationContext context) {
        JsonArray arr = new JsonArray();
        for (int i = 0, len = src.size(); i < len; i++) {
            arr.add(Byte.toString(src.get(i)));
        }
        return arr;
    }
}