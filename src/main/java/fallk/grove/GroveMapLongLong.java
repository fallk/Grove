// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TLongLongIterator;
import gnu.trove.map.TLongLongMap;
import gnu.trove.map.hash.TLongLongHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// long, long = byte, char, etc.
// L, L = B, C, etc.
// Long, Long = Byte, Char, etc.
// Long, Long = Byte, Character, etc.
// Long, Long = Byte, Character, etc. but Int instead of Integer
// Long.parseLong = Byte.parseByte, Integer.parseInt, Grove.parseChar
// LongLong = ByteByte, ByteChar, etc.
final class GroveMapLongLong implements JsonSerializer<TLongLongMap>, JsonDeserializer<TLongLongMap> {
    public static final GroveMapLongLong INSTANCE = new GroveMapLongLong();
    private GroveMapLongLong() {}

    public TLongLongMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TLongLongMap map = new TLongLongHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Long.parseLong(el.getKey()), el.getValue().getAsLong());
        }
        return map;
    }

    public JsonElement serialize(TLongLongMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TLongLongIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Long.toString(iterator.key()), Long.toString(iterator.value()));
        }

        return jmap;
    }
}