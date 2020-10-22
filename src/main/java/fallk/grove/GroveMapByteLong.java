// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TByteLongIterator;
import gnu.trove.map.TByteLongMap;
import gnu.trove.map.hash.TByteLongHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// byte, long = byte, char, etc.
// B, L = B, C, etc.
// Byte, Long = Byte, Char, etc.
// Byte, Long = Byte, Character, etc.
// Byte, Long = Byte, Character, etc. but Int instead of Integer
// Byte.parseByte = Byte.parseByte, Integer.parseInt, Grove.parseChar
// ByteLong = ByteByte, ByteChar, etc.
final class GroveMapByteLong implements JsonSerializer<TByteLongMap>, JsonDeserializer<TByteLongMap> {
    public static final GroveMapByteLong INSTANCE = new GroveMapByteLong();
    private GroveMapByteLong() {}

    public TByteLongMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TByteLongMap map = new TByteLongHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Byte.parseByte(el.getKey()), el.getValue().getAsLong());
        }
        return map;
    }

    public JsonElement serialize(TByteLongMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TByteLongIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Byte.toString(iterator.key()), Long.toString(iterator.value()));
        }

        return jmap;
    }
}