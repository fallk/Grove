// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TCharByteIterator;
import gnu.trove.map.TCharByteMap;
import gnu.trove.map.hash.TCharByteHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// char, byte = byte, char, etc.
// C, B = B, C, etc.
// Char, Byte = Byte, Char, etc.
// Character, Byte = Byte, Character, etc.
// Character, Byte = Byte, Character, etc. but Int instead of Integer
// Grove.parseChar = Byte.parseByte, Integer.parseInt, Grove.parseChar
// CharByte = ByteByte, ByteChar, etc.
final class GroveMapCharByte implements JsonSerializer<TCharByteMap>, JsonDeserializer<TCharByteMap> {
    public static final GroveMapCharByte INSTANCE = new GroveMapCharByte();
    private GroveMapCharByte() {}

    public TCharByteMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TCharByteMap map = new TCharByteHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Grove.parseChar(el.getKey()), el.getValue().getAsByte());
        }
        return map;
    }

    public JsonElement serialize(TCharByteMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TCharByteIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Character.toString(iterator.key()), Byte.toString(iterator.value()));
        }

        return jmap;
    }
}