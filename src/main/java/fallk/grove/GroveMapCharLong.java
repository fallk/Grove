// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TCharLongIterator;
import gnu.trove.map.TCharLongMap;
import gnu.trove.map.hash.TCharLongHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// char, long = byte, char, etc.
// C, L = B, C, etc.
// Char, Long = Byte, Char, etc.
// Character, Long = Byte, Character, etc.
// Character, Long = Byte, Character, etc. but Int instead of Integer
// Grove.parseChar = Byte.parseByte, Integer.parseInt, Grove.parseChar
// CharLong = ByteByte, ByteChar, etc.
final class GroveMapCharLong implements JsonSerializer<TCharLongMap>, JsonDeserializer<TCharLongMap> {
    public static final GroveMapCharLong INSTANCE = new GroveMapCharLong();
    private GroveMapCharLong() {}

    public TCharLongMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TCharLongMap map = new TCharLongHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Grove.parseChar(el.getKey()), el.getValue().getAsLong());
        }
        return map;
    }

    public JsonElement serialize(TCharLongMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TCharLongIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Character.toString(iterator.key()), Long.toString(iterator.value()));
        }

        return jmap;
    }
}