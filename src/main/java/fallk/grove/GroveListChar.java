// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.list.array.TCharArrayList;
import gnu.trove.list.TCharList;

import java.lang.reflect.Type;

// Tokens:
// char = byte, char, etc.
// C = B, C, etc.
// Char = Byte, Char, etc.
// Character = Byte, Character, etc.
// Character = Byte, Character, etc. but Int instead of Integer
final class GroveListChar implements JsonSerializer<TCharList>, JsonDeserializer<TCharList> {
    public static final GroveListChar INSTANCE = new GroveListChar();
    private GroveListChar() {}

    public TCharList deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonArray arr = json.getAsJsonArray();
        TCharArrayList ls = new TCharArrayList(arr.size());
        for (JsonElement el : arr) {
            ls.add(el.getAsCharacter());
        }
        return ls;
    }

    public JsonElement serialize(TCharList src, Type typeOfSrc, JsonSerializationContext context) {
        JsonArray arr = new JsonArray();
        for (int i = 0, len = src.size(); i < len; i++) {
            arr.add(Character.toString(src.get(i)));
        }
        return arr;
    }
}