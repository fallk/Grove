// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TByteIntIterator;
import gnu.trove.map.TByteIntMap;
import gnu.trove.map.hash.TByteIntHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// byte, int = byte, char, etc.
// B, I = B, C, etc.
// Byte, Int = Byte, Char, etc.
// Byte, Integer = Byte, Character, etc.
// Byte, Int = Byte, Character, etc. but Int instead of Integer
// Byte.parseByte = Byte.parseByte, Integer.parseInt, Grove.parseChar
// ByteInt = ByteByte, ByteChar, etc.
final class GroveMapByteInt implements JsonSerializer<TByteIntMap>, JsonDeserializer<TByteIntMap> {
    public static final GroveMapByteInt INSTANCE = new GroveMapByteInt();
    private GroveMapByteInt() {}

    public TByteIntMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TByteIntMap map = new TByteIntHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Byte.parseByte(el.getKey()), el.getValue().getAsInt());
        }
        return map;
    }

    public JsonElement serialize(TByteIntMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TByteIntIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Byte.toString(iterator.key()), Integer.toString(iterator.value()));
        }

        return jmap;
    }
}