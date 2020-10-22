// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TShortDoubleIterator;
import gnu.trove.map.TShortDoubleMap;
import gnu.trove.map.hash.TShortDoubleHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// short, double = byte, char, etc.
// S, D = B, C, etc.
// Short, Double = Byte, Char, etc.
// Short, Double = Byte, Character, etc.
// Short, Double = Byte, Character, etc. but Int instead of Integer
// Short.parseShort = Byte.parseByte, Integer.parseInt, Grove.parseChar
// ShortDouble = ByteByte, ByteChar, etc.
final class GroveMapShortDouble implements JsonSerializer<TShortDoubleMap>, JsonDeserializer<TShortDoubleMap> {
    public static final GroveMapShortDouble INSTANCE = new GroveMapShortDouble();
    private GroveMapShortDouble() {}

    public TShortDoubleMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TShortDoubleMap map = new TShortDoubleHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Short.parseShort(el.getKey()), el.getValue().getAsDouble());
        }
        return map;
    }

    public JsonElement serialize(TShortDoubleMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TShortDoubleIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Short.toString(iterator.key()), Double.toString(iterator.value()));
        }

        return jmap;
    }
}