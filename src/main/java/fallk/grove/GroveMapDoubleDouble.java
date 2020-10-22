// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TDoubleDoubleIterator;
import gnu.trove.map.TDoubleDoubleMap;
import gnu.trove.map.hash.TDoubleDoubleHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// double, double = byte, char, etc.
// D, D = B, C, etc.
// Double, Double = Byte, Char, etc.
// Double, Double = Byte, Character, etc.
// Double, Double = Byte, Character, etc. but Int instead of Integer
// Double.parseDouble = Byte.parseByte, Integer.parseInt, Grove.parseChar
// DoubleDouble = ByteByte, ByteChar, etc.
final class GroveMapDoubleDouble implements JsonSerializer<TDoubleDoubleMap>, JsonDeserializer<TDoubleDoubleMap> {
    public static final GroveMapDoubleDouble INSTANCE = new GroveMapDoubleDouble();
    private GroveMapDoubleDouble() {}

    public TDoubleDoubleMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TDoubleDoubleMap map = new TDoubleDoubleHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Double.parseDouble(el.getKey()), el.getValue().getAsDouble());
        }
        return map;
    }

    public JsonElement serialize(TDoubleDoubleMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TDoubleDoubleIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Double.toString(iterator.key()), Double.toString(iterator.value()));
        }

        return jmap;
    }
}