// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TByteCharIterator;
import gnu.trove.map.TByteCharMap;
import gnu.trove.map.hash.TByteCharHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// byte, char = byte, char, etc.
// B, C = B, C, etc.
// Byte, Char = Byte, Char, etc.
// Byte, Character = Byte, Character, etc.
// Byte, Character = Byte, Character, etc. but Int instead of Integer
// Byte.parseByte = Byte.parseByte, Integer.parseInt, Grove.parseChar
// ByteChar = ByteByte, ByteChar, etc.
final class GroveMapByteChar implements JsonSerializer<TByteCharMap>, JsonDeserializer<TByteCharMap> {
    public static final GroveMapByteChar INSTANCE = new GroveMapByteChar();
    private GroveMapByteChar() {}

    public TByteCharMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TByteCharMap map = new TByteCharHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Byte.parseByte(el.getKey()), el.getValue().getAsCharacter());
        }
        return map;
    }

    public JsonElement serialize(TByteCharMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TByteCharIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Byte.toString(iterator.key()), Character.toString(iterator.value()));
        }

        return jmap;
    }
}