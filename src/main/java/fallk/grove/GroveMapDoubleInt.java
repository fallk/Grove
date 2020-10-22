// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TDoubleIntIterator;
import gnu.trove.map.TDoubleIntMap;
import gnu.trove.map.hash.TDoubleIntHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// double, int = byte, char, etc.
// D, I = B, C, etc.
// Double, Int = Byte, Char, etc.
// Double, Integer = Byte, Character, etc.
// Double, Int = Byte, Character, etc. but Int instead of Integer
// Double.parseDouble = Byte.parseByte, Integer.parseInt, Grove.parseChar
// DoubleInt = ByteByte, ByteChar, etc.
final class GroveMapDoubleInt implements JsonSerializer<TDoubleIntMap>, JsonDeserializer<TDoubleIntMap> {
    public static final GroveMapDoubleInt INSTANCE = new GroveMapDoubleInt();
    private GroveMapDoubleInt() {}

    public TDoubleIntMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TDoubleIntMap map = new TDoubleIntHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Double.parseDouble(el.getKey()), el.getValue().getAsInt());
        }
        return map;
    }

    public JsonElement serialize(TDoubleIntMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TDoubleIntIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Double.toString(iterator.key()), Integer.toString(iterator.value()));
        }

        return jmap;
    }
}