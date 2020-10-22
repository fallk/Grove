// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TDoubleFloatIterator;
import gnu.trove.map.TDoubleFloatMap;
import gnu.trove.map.hash.TDoubleFloatHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// double, float = byte, char, etc.
// D, F = B, C, etc.
// Double, Float = Byte, Char, etc.
// Double, Float = Byte, Character, etc.
// Double, Float = Byte, Character, etc. but Int instead of Integer
// Double.parseDouble = Byte.parseByte, Integer.parseInt, Grove.parseChar
// DoubleFloat = ByteByte, ByteChar, etc.
final class GroveMapDoubleFloat implements JsonSerializer<TDoubleFloatMap>, JsonDeserializer<TDoubleFloatMap> {
    public static final GroveMapDoubleFloat INSTANCE = new GroveMapDoubleFloat();
    private GroveMapDoubleFloat() {}

    public TDoubleFloatMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TDoubleFloatMap map = new TDoubleFloatHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Double.parseDouble(el.getKey()), el.getValue().getAsFloat());
        }
        return map;
    }

    public JsonElement serialize(TDoubleFloatMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TDoubleFloatIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Double.toString(iterator.key()), Float.toString(iterator.value()));
        }

        return jmap;
    }
}