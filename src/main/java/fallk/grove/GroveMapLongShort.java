// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TLongShortIterator;
import gnu.trove.map.TLongShortMap;
import gnu.trove.map.hash.TLongShortHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// long, short = byte, char, etc.
// L, S = B, C, etc.
// Long, Short = Byte, Char, etc.
// Long, Short = Byte, Character, etc.
// Long, Short = Byte, Character, etc. but Int instead of Integer
// Long.parseLong = Byte.parseByte, Integer.parseInt, Grove.parseChar
// LongShort = ByteByte, ByteChar, etc.
final class GroveMapLongShort implements JsonSerializer<TLongShortMap>, JsonDeserializer<TLongShortMap> {
    public static final GroveMapLongShort INSTANCE = new GroveMapLongShort();
    private GroveMapLongShort() {}

    public TLongShortMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TLongShortMap map = new TLongShortHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Long.parseLong(el.getKey()), el.getValue().getAsShort());
        }
        return map;
    }

    public JsonElement serialize(TLongShortMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TLongShortIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Long.toString(iterator.key()), Short.toString(iterator.value()));
        }

        return jmap;
    }
}