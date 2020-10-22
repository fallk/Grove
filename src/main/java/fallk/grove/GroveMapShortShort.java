// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TShortShortIterator;
import gnu.trove.map.TShortShortMap;
import gnu.trove.map.hash.TShortShortHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// short, short = byte, char, etc.
// S, S = B, C, etc.
// Short, Short = Byte, Char, etc.
// Short, Short = Byte, Character, etc.
// Short, Short = Byte, Character, etc. but Int instead of Integer
// Short.parseShort = Byte.parseByte, Integer.parseInt, Grove.parseChar
// ShortShort = ByteByte, ByteChar, etc.
final class GroveMapShortShort implements JsonSerializer<TShortShortMap>, JsonDeserializer<TShortShortMap> {
    public static final GroveMapShortShort INSTANCE = new GroveMapShortShort();
    private GroveMapShortShort() {}

    public TShortShortMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TShortShortMap map = new TShortShortHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Short.parseShort(el.getKey()), el.getValue().getAsShort());
        }
        return map;
    }

    public JsonElement serialize(TShortShortMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TShortShortIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Short.toString(iterator.key()), Short.toString(iterator.value()));
        }

        return jmap;
    }
}