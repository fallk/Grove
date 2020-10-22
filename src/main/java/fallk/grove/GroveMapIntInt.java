// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TIntIntIterator;
import gnu.trove.map.TIntIntMap;
import gnu.trove.map.hash.TIntIntHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// int, int = byte, char, etc.
// I, I = B, C, etc.
// Int, Int = Byte, Char, etc.
// Integer, Integer = Byte, Character, etc.
// Int, Int = Byte, Character, etc. but Int instead of Integer
// Integer.parseInt = Byte.parseByte, Integer.parseInt, Grove.parseChar
// IntInt = ByteByte, ByteChar, etc.
final class GroveMapIntInt implements JsonSerializer<TIntIntMap>, JsonDeserializer<TIntIntMap> {
    public static final GroveMapIntInt INSTANCE = new GroveMapIntInt();
    private GroveMapIntInt() {}

    public TIntIntMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TIntIntMap map = new TIntIntHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Integer.parseInt(el.getKey()), el.getValue().getAsInt());
        }
        return map;
    }

    public JsonElement serialize(TIntIntMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TIntIntIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Integer.toString(iterator.key()), Integer.toString(iterator.value()));
        }

        return jmap;
    }
}