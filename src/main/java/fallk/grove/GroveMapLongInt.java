// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TLongIntIterator;
import gnu.trove.map.TLongIntMap;
import gnu.trove.map.hash.TLongIntHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// long, int = byte, char, etc.
// L, I = B, C, etc.
// Long, Int = Byte, Char, etc.
// Long, Integer = Byte, Character, etc.
// Long, Int = Byte, Character, etc. but Int instead of Integer
// Long.parseLong = Byte.parseByte, Integer.parseInt, Grove.parseChar
// LongInt = ByteByte, ByteChar, etc.
final class GroveMapLongInt implements JsonSerializer<TLongIntMap>, JsonDeserializer<TLongIntMap> {
    public static final GroveMapLongInt INSTANCE = new GroveMapLongInt();
    private GroveMapLongInt() {}

    public TLongIntMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TLongIntMap map = new TLongIntHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Long.parseLong(el.getKey()), el.getValue().getAsInt());
        }
        return map;
    }

    public JsonElement serialize(TLongIntMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TLongIntIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Long.toString(iterator.key()), Integer.toString(iterator.value()));
        }

        return jmap;
    }
}