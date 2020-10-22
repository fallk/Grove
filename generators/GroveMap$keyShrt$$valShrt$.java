// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import gnu.trove.iterator.T$kvShort$Iterator;
import gnu.trove.map.T$kvShort$Map;
import gnu.trove.map.hash.T$kvShort$HashMap;

import java.lang.reflect.Type;
import java.util.Map.Entry;

// Tokens:
// $keyPrim$, $valPrim$ = byte, char, etc.
// $keyName$, $valName$ = B, C, etc.
// $keyShrt$, $valShrt$ = Byte, Char, etc.
// $keyLong$, $valLong$ = Byte, Character, etc.
// $keyLongGson$, $valLongGson$ = Byte, Character, etc. but Int instead of Integer
// $keySpecialCaseParse$ = Byte.parseByte, Integer.parseInt, Grove.parseChar
// $kvShort$ = ByteByte, ByteChar, etc.
final class GroveMap$keyShrt$$valShrt$ implements JsonSerializer<T$kvShort$Map>, JsonDeserializer<T$kvShort$Map> {
    public static final GroveMap$keyShrt$$valShrt$ INSTANCE = new GroveMap$keyShrt$$valShrt$();
    private GroveMap$keyShrt$$valShrt$() {}

    public T$kvShort$Map deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        T$kvShort$Map map = new T$kvShort$HashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put($keySpecialCaseParse$(el.getKey()), el.getValue().getAs$valLongGson$());
        }
        return map;
    }

    public JsonElement serialize(T$kvShort$Map src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        for (T$kvShort$Iterator iterator = src.iterator(); iterator.hasNext(); ) {
            iterator.advance();
            jmap.addProperty($keyLong$.toString(iterator.key()), $valLong$.toString(iterator.value()));
        }

        return jmap;
    }
}