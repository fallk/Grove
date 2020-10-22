// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TCharFloatIterator;
import gnu.trove.map.TCharFloatMap;
import gnu.trove.map.hash.TCharFloatHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// char, float = byte, char, etc.
// C, F = B, C, etc.
// Char, Float = Byte, Char, etc.
// Character, Float = Byte, Character, etc.
// Character, Float = Byte, Character, etc. but Int instead of Integer
// Grove.parseChar = Byte.parseByte, Integer.parseInt, Grove.parseChar
// CharFloat = ByteByte, ByteChar, etc.
final class GroveMapCharFloat implements JsonSerializer<TCharFloatMap>, JsonDeserializer<TCharFloatMap> {
    public static final GroveMapCharFloat INSTANCE = new GroveMapCharFloat();
    private GroveMapCharFloat() {}

    public TCharFloatMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TCharFloatMap map = new TCharFloatHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Grove.parseChar(el.getKey()), el.getValue().getAsFloat());
        }
        return map;
    }

    public JsonElement serialize(TCharFloatMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TCharFloatIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Character.toString(iterator.key()), Float.toString(iterator.value()));
        }

        return jmap;
    }
}