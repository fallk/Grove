// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TIntDoubleIterator;
import gnu.trove.map.TIntDoubleMap;
import gnu.trove.map.hash.TIntDoubleHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// int, double = byte, char, etc.
// I, D = B, C, etc.
// Int, Double = Byte, Char, etc.
// Integer, Double = Byte, Character, etc.
// Int, Double = Byte, Character, etc. but Int instead of Integer
// Integer.parseInt = Byte.parseByte, Integer.parseInt, Grove.parseChar
// IntDouble = ByteByte, ByteChar, etc.
final class GroveMapIntDouble implements JsonSerializer<TIntDoubleMap>, JsonDeserializer<TIntDoubleMap> {
    public static final GroveMapIntDouble INSTANCE = new GroveMapIntDouble();
    private GroveMapIntDouble() {}

    public TIntDoubleMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TIntDoubleMap map = new TIntDoubleHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Integer.parseInt(el.getKey()), el.getValue().getAsDouble());
        }
        return map;
    }

    public JsonElement serialize(TIntDoubleMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TIntDoubleIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Integer.toString(iterator.key()), Double.toString(iterator.value()));
        }

        return jmap;
    }
}