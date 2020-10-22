// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.list.array.T$shrt$ArrayList;

import java.lang.reflect.Type;

// Tokens:
// $prim$ = byte, char, etc.
// $name$ = B, C, etc.
// $shrt$ = Byte, Char, etc.
// $long$ = Byte, Character, etc.
// $longGson$ = Byte, Character, etc. but Int instead of Integer
final class GroveArrayList$shrt$ implements JsonSerializer<T$shrt$ArrayList>, JsonDeserializer<T$shrt$ArrayList> {
    public static final GroveArrayList$shrt$ INSTANCE = new GroveArrayList$shrt$();
    private GroveArrayList$shrt$() {}

    public T$shrt$ArrayList deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonArray arr = json.getAsJsonArray();
        T$shrt$ArrayList ls = new T$shrt$ArrayList(arr.size());
        for (JsonElement el : arr) {
            ls.add(el.getAs$longGson$());
        }
        return ls;
    }

    public JsonElement serialize(T$shrt$ArrayList src, Type typeOfSrc, JsonSerializationContext context) {
        JsonArray arr = new JsonArray();
        for (int i = 0, len = src.size(); i < len; i++) {
            arr.add($long$.toString(src.get(i)));
        }
        return arr;
    }
}