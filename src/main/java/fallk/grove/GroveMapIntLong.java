// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TIntLongIterator;
import gnu.trove.map.TIntLongMap;
import gnu.trove.map.hash.TIntLongHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// int, long = byte, char, etc.
// I, L = B, C, etc.
// Int, Long = Byte, Char, etc.
// Integer, Long = Byte, Character, etc.
// Int, Long = Byte, Character, etc. but Int instead of Integer
// Integer.parseInt = Byte.parseByte, Integer.parseInt, Grove.parseChar
// IntLong = ByteByte, ByteChar, etc.
final class GroveMapIntLong implements JsonSerializer<TIntLongMap>, JsonDeserializer<TIntLongMap> {
    public static final GroveMapIntLong INSTANCE = new GroveMapIntLong();
    private GroveMapIntLong() {}

    public TIntLongMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TIntLongMap map = new TIntLongHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Integer.parseInt(el.getKey()), el.getValue().getAsLong());
        }
        return map;
    }

    public JsonElement serialize(TIntLongMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TIntLongIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Integer.toString(iterator.key()), Long.toString(iterator.value()));
        }

        return jmap;
    }
}