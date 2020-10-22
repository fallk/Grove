// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TCharDoubleIterator;
import gnu.trove.map.TCharDoubleMap;
import gnu.trove.map.hash.TCharDoubleHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// char, double = byte, char, etc.
// C, D = B, C, etc.
// Char, Double = Byte, Char, etc.
// Character, Double = Byte, Character, etc.
// Character, Double = Byte, Character, etc. but Int instead of Integer
// Grove.parseChar = Byte.parseByte, Integer.parseInt, Grove.parseChar
// CharDouble = ByteByte, ByteChar, etc.
final class GroveMapCharDouble implements JsonSerializer<TCharDoubleMap>, JsonDeserializer<TCharDoubleMap> {
    public static final GroveMapCharDouble INSTANCE = new GroveMapCharDouble();
    private GroveMapCharDouble() {}

    public TCharDoubleMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TCharDoubleMap map = new TCharDoubleHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Grove.parseChar(el.getKey()), el.getValue().getAsDouble());
        }
        return map;
    }

    public JsonElement serialize(TCharDoubleMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TCharDoubleIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Character.toString(iterator.key()), Double.toString(iterator.value()));
        }

        return jmap;
    }
}