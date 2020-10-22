// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TShortLongIterator;
import gnu.trove.map.TShortLongMap;
import gnu.trove.map.hash.TShortLongHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// short, long = byte, char, etc.
// S, L = B, C, etc.
// Short, Long = Byte, Char, etc.
// Short, Long = Byte, Character, etc.
// Short, Long = Byte, Character, etc. but Int instead of Integer
// Short.parseShort = Byte.parseByte, Integer.parseInt, Grove.parseChar
// ShortLong = ByteByte, ByteChar, etc.
final class GroveMapShortLong implements JsonSerializer<TShortLongMap>, JsonDeserializer<TShortLongMap> {
    public static final GroveMapShortLong INSTANCE = new GroveMapShortLong();
    private GroveMapShortLong() {}

    public TShortLongMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TShortLongMap map = new TShortLongHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Short.parseShort(el.getKey()), el.getValue().getAsLong());
        }
        return map;
    }

    public JsonElement serialize(TShortLongMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TShortLongIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Short.toString(iterator.key()), Long.toString(iterator.value()));
        }

        return jmap;
    }
}