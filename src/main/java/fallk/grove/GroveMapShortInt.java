// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TShortIntIterator;
import gnu.trove.map.TShortIntMap;
import gnu.trove.map.hash.TShortIntHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// short, int = byte, char, etc.
// S, I = B, C, etc.
// Short, Int = Byte, Char, etc.
// Short, Integer = Byte, Character, etc.
// Short, Int = Byte, Character, etc. but Int instead of Integer
// Short.parseShort = Byte.parseByte, Integer.parseInt, Grove.parseChar
// ShortInt = ByteByte, ByteChar, etc.
final class GroveMapShortInt implements JsonSerializer<TShortIntMap>, JsonDeserializer<TShortIntMap> {
    public static final GroveMapShortInt INSTANCE = new GroveMapShortInt();
    private GroveMapShortInt() {}

    public TShortIntMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TShortIntMap map = new TShortIntHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Short.parseShort(el.getKey()), el.getValue().getAsInt());
        }
        return map;
    }

    public JsonElement serialize(TShortIntMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TShortIntIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Short.toString(iterator.key()), Integer.toString(iterator.value()));
        }

        return jmap;
    }
}