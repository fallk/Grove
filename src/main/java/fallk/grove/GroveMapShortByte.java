// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.TShortByteIterator;
import gnu.trove.map.TShortByteMap;
import gnu.trove.map.hash.TShortByteHashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// short, byte = byte, char, etc.
// S, B = B, C, etc.
// Short, Byte = Byte, Char, etc.
// Short, Byte = Byte, Character, etc.
// Short, Byte = Byte, Character, etc. but Int instead of Integer
// Short.parseShort = Byte.parseByte, Integer.parseInt, Grove.parseChar
// ShortByte = ByteByte, ByteChar, etc.
final class GroveMapShortByte implements JsonSerializer<TShortByteMap>, JsonDeserializer<TShortByteMap> {
    public static final GroveMapShortByte INSTANCE = new GroveMapShortByte();
    private GroveMapShortByte() {}

    public TShortByteMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TShortByteMap map = new TShortByteHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Short.parseShort(el.getKey()), el.getValue().getAsByte());
        }
        return map;
    }

    public JsonElement serialize(TShortByteMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (TShortByteIterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty(Short.toString(iterator.key()), Byte.toString(iterator.value()));
        }

        return jmap;
    }
}