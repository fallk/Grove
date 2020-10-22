// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TShortFloatIterator;
import gnu.trove.map.TShortFloatMap;
import gnu.trove.map.hash.TShortFloatHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// short, float = byte, char, etc.
// S, F = B, C, etc.
// Short, Float = Byte, Char, etc.
// Short, Float = Byte, Character, etc.
// Short, Float = Byte, Character, etc. but Int instead of Integer
// Short.parseShort = Byte.parseByte, Integer.parseInt, Grove.parseChar
// ShortFloat = ByteByte, ByteChar, etc.
final class GroveMapShortFloat implements JsonSerializer<TShortFloatMap>, JsonDeserializer<TShortFloatMap> {
    public static final GroveMapShortFloat INSTANCE = new GroveMapShortFloat();
    private GroveMapShortFloat() {}

    public TShortFloatMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TShortFloatMap map = new TShortFloatHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Short.parseShort(el.getKey()), el.getValue().getAsFloat());
        }
        return map;
    }

    public JsonElement serialize(TShortFloatMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TShortFloatIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Short.toString(iterator.key()), Float.toString(iterator.value()));
        }

        return jmap;
    }
}