// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TCharIntIterator;
import gnu.trove.map.TCharIntMap;
import gnu.trove.map.hash.TCharIntHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// char, int = byte, char, etc.
// C, I = B, C, etc.
// Char, Int = Byte, Char, etc.
// Character, Integer = Byte, Character, etc.
// Character, Int = Byte, Character, etc. but Int instead of Integer
// Grove.parseChar = Byte.parseByte, Integer.parseInt, Grove.parseChar
// CharInt = ByteByte, ByteChar, etc.
final class GroveMapCharInt implements JsonSerializer<TCharIntMap>, JsonDeserializer<TCharIntMap> {
    public static final GroveMapCharInt INSTANCE = new GroveMapCharInt();
    private GroveMapCharInt() {}

    public TCharIntMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TCharIntMap map = new TCharIntHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Grove.parseChar(el.getKey()), el.getValue().getAsInt());
        }
        return map;
    }

    public JsonElement serialize(TCharIntMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TCharIntIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Character.toString(iterator.key()), Integer.toString(iterator.value()));
        }

        return jmap;
    }
}