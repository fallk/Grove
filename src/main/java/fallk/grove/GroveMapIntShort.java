// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TIntShortIterator;
import gnu.trove.map.TIntShortMap;
import gnu.trove.map.hash.TIntShortHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// int, short = byte, char, etc.
// I, S = B, C, etc.
// Int, Short = Byte, Char, etc.
// Integer, Short = Byte, Character, etc.
// Int, Short = Byte, Character, etc. but Int instead of Integer
// Integer.parseInt = Byte.parseByte, Integer.parseInt, Grove.parseChar
// IntShort = ByteByte, ByteChar, etc.
final class GroveMapIntShort implements JsonSerializer<TIntShortMap>, JsonDeserializer<TIntShortMap> {
    public static final GroveMapIntShort INSTANCE = new GroveMapIntShort();
    private GroveMapIntShort() {}

    public TIntShortMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TIntShortMap map = new TIntShortHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Integer.parseInt(el.getKey()), el.getValue().getAsShort());
        }
        return map;
    }

    public JsonElement serialize(TIntShortMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TIntShortIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Integer.toString(iterator.key()), Short.toString(iterator.value()));
        }

        return jmap;
    }
}