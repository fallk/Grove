// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TByteShortIterator;
import gnu.trove.map.TByteShortMap;
import gnu.trove.map.hash.TByteShortHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// byte, short = byte, char, etc.
// B, S = B, C, etc.
// Byte, Short = Byte, Char, etc.
// Byte, Short = Byte, Character, etc.
// Byte, Short = Byte, Character, etc. but Int instead of Integer
// Byte.parseByte = Byte.parseByte, Integer.parseInt, Grove.parseChar
// ByteShort = ByteByte, ByteChar, etc.
final class GroveMapByteShort implements JsonSerializer<TByteShortMap>, JsonDeserializer<TByteShortMap> {
    public static final GroveMapByteShort INSTANCE = new GroveMapByteShort();
    private GroveMapByteShort() {}

    public TByteShortMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TByteShortMap map = new TByteShortHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Byte.parseByte(el.getKey()), el.getValue().getAsShort());
        }
        return map;
    }

    public JsonElement serialize(TByteShortMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TByteShortIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Byte.toString(iterator.key()), Short.toString(iterator.value()));
        }

        return jmap;
    }
}