// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TFloatCharIterator;
import gnu.trove.map.TFloatCharMap;
import gnu.trove.map.hash.TFloatCharHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// float, char = byte, char, etc.
// F, C = B, C, etc.
// Float, Char = Byte, Char, etc.
// Float, Character = Byte, Character, etc.
// Float, Character = Byte, Character, etc. but Int instead of Integer
// Float.parseFloat = Byte.parseByte, Integer.parseInt, Grove.parseChar
// FloatChar = ByteByte, ByteChar, etc.
final class GroveMapFloatChar implements JsonSerializer<TFloatCharMap>, JsonDeserializer<TFloatCharMap> {
    public static final GroveMapFloatChar INSTANCE = new GroveMapFloatChar();
    private GroveMapFloatChar() {}

    public TFloatCharMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TFloatCharMap map = new TFloatCharHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Float.parseFloat(el.getKey()), el.getValue().getAsCharacter());
        }
        return map;
    }

    public JsonElement serialize(TFloatCharMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TFloatCharIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Float.toString(iterator.key()), Character.toString(iterator.value()));
        }

        return jmap;
    }
}