// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TDoubleShortIterator;
import gnu.trove.map.TDoubleShortMap;
import gnu.trove.map.hash.TDoubleShortHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// double, short = byte, char, etc.
// D, S = B, C, etc.
// Double, Short = Byte, Char, etc.
// Double, Short = Byte, Character, etc.
// Double, Short = Byte, Character, etc. but Int instead of Integer
// Double.parseDouble = Byte.parseByte, Integer.parseInt, Grove.parseChar
// DoubleShort = ByteByte, ByteChar, etc.
final class GroveMapDoubleShort implements JsonSerializer<TDoubleShortMap>, JsonDeserializer<TDoubleShortMap> {
    public static final GroveMapDoubleShort INSTANCE = new GroveMapDoubleShort();
    private GroveMapDoubleShort() {}

    public TDoubleShortMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TDoubleShortMap map = new TDoubleShortHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Double.parseDouble(el.getKey()), el.getValue().getAsShort());
        }
        return map;
    }

    public JsonElement serialize(TDoubleShortMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TDoubleShortIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Double.toString(iterator.key()), Short.toString(iterator.value()));
        }

        return jmap;
    }
}