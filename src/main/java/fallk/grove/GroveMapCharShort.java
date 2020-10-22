// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TCharShortIterator;
import gnu.trove.map.TCharShortMap;
import gnu.trove.map.hash.TCharShortHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// char, short = byte, char, etc.
// C, S = B, C, etc.
// Char, Short = Byte, Char, etc.
// Character, Short = Byte, Character, etc.
// Character, Short = Byte, Character, etc. but Int instead of Integer
// Grove.parseChar = Byte.parseByte, Integer.parseInt, Grove.parseChar
// CharShort = ByteByte, ByteChar, etc.
final class GroveMapCharShort implements JsonSerializer<TCharShortMap>, JsonDeserializer<TCharShortMap> {
    public static final GroveMapCharShort INSTANCE = new GroveMapCharShort();
    private GroveMapCharShort() {}

    public TCharShortMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TCharShortMap map = new TCharShortHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Grove.parseChar(el.getKey()), el.getValue().getAsShort());
        }
        return map;
    }

    public JsonElement serialize(TCharShortMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TCharShortIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Character.toString(iterator.key()), Short.toString(iterator.value()));
        }

        return jmap;
    }
}