// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TDoubleCharIterator;
import gnu.trove.map.TDoubleCharMap;
import gnu.trove.map.hash.TDoubleCharHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// double, char = byte, char, etc.
// D, C = B, C, etc.
// Double, Char = Byte, Char, etc.
// Double, Character = Byte, Character, etc.
// Double, Character = Byte, Character, etc. but Int instead of Integer
// Double.parseDouble = Byte.parseByte, Integer.parseInt, Grove.parseChar
// DoubleChar = ByteByte, ByteChar, etc.
final class GroveMapDoubleChar implements JsonSerializer<TDoubleCharMap>, JsonDeserializer<TDoubleCharMap> {
    public static final GroveMapDoubleChar INSTANCE = new GroveMapDoubleChar();
    private GroveMapDoubleChar() {}

    public TDoubleCharMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TDoubleCharMap map = new TDoubleCharHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Double.parseDouble(el.getKey()), el.getValue().getAsCharacter());
        }
        return map;
    }

    public JsonElement serialize(TDoubleCharMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TDoubleCharIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Double.toString(iterator.key()), Character.toString(iterator.value()));
        }

        return jmap;
    }
}