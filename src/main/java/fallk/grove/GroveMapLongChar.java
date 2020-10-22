// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TLongCharIterator;
import gnu.trove.map.TLongCharMap;
import gnu.trove.map.hash.TLongCharHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// long, char = byte, char, etc.
// L, C = B, C, etc.
// Long, Char = Byte, Char, etc.
// Long, Character = Byte, Character, etc.
// Long, Character = Byte, Character, etc. but Int instead of Integer
// Long.parseLong = Byte.parseByte, Integer.parseInt, Grove.parseChar
// LongChar = ByteByte, ByteChar, etc.
final class GroveMapLongChar implements JsonSerializer<TLongCharMap>, JsonDeserializer<TLongCharMap> {
    public static final GroveMapLongChar INSTANCE = new GroveMapLongChar();
    private GroveMapLongChar() {}

    public TLongCharMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TLongCharMap map = new TLongCharHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Long.parseLong(el.getKey()), el.getValue().getAsCharacter());
        }
        return map;
    }

    public JsonElement serialize(TLongCharMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TLongCharIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Long.toString(iterator.key()), Character.toString(iterator.value()));
        }

        return jmap;
    }
}