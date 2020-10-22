// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TDoubleLongIterator;
import gnu.trove.map.TDoubleLongMap;
import gnu.trove.map.hash.TDoubleLongHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// double, long = byte, char, etc.
// D, L = B, C, etc.
// Double, Long = Byte, Char, etc.
// Double, Long = Byte, Character, etc.
// Double, Long = Byte, Character, etc. but Int instead of Integer
// Double.parseDouble = Byte.parseByte, Integer.parseInt, Grove.parseChar
// DoubleLong = ByteByte, ByteChar, etc.
final class GroveMapDoubleLong implements JsonSerializer<TDoubleLongMap>, JsonDeserializer<TDoubleLongMap> {
    public static final GroveMapDoubleLong INSTANCE = new GroveMapDoubleLong();
    private GroveMapDoubleLong() {}

    public TDoubleLongMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TDoubleLongMap map = new TDoubleLongHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Double.parseDouble(el.getKey()), el.getValue().getAsLong());
        }
        return map;
    }

    public JsonElement serialize(TDoubleLongMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TDoubleLongIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Double.toString(iterator.key()), Long.toString(iterator.value()));
        }

        return jmap;
    }
}