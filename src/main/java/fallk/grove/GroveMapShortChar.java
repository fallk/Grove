// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TShortCharIterator;
import gnu.trove.map.TShortCharMap;
import gnu.trove.map.hash.TShortCharHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// short, char = byte, char, etc.
// S, C = B, C, etc.
// Short, Char = Byte, Char, etc.
// Short, Character = Byte, Character, etc.
// Short, Character = Byte, Character, etc. but Int instead of Integer
// Short.parseShort = Byte.parseByte, Integer.parseInt, Grove.parseChar
// ShortChar = ByteByte, ByteChar, etc.
final class GroveMapShortChar implements JsonSerializer<TShortCharMap>, JsonDeserializer<TShortCharMap> {
    public static final GroveMapShortChar INSTANCE = new GroveMapShortChar();
    private GroveMapShortChar() {}

    public TShortCharMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TShortCharMap map = new TShortCharHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Short.parseShort(el.getKey()), el.getValue().getAsCharacter());
        }
        return map;
    }

    public JsonElement serialize(TShortCharMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TShortCharIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Short.toString(iterator.key()), Character.toString(iterator.value()));
        }

        return jmap;
    }
}