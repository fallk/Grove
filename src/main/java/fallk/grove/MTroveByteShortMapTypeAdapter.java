// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.lang.reflect.Type;
import java.util.Map.Entry;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import gnu.trove.decorator.TByteSetDecorator;
import gnu.trove.map.TByteShortMap;
import gnu.trove.map.hash.TByteShortHashMap;

//byte,short
public final class MTroveByteShortMapTypeAdapter implements JsonSerializer<TByteShortMap>, JsonDeserializer<TByteShortMap> {
    // guava says to implement this differently, check doc if this dosnt work

    public TByteShortMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TByteShortMap map = new TByteShortHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Byte.parseByte(el.getKey()), Convert.getAsShort(el.getValue()));
        }
        return map;
    }
    
    public JsonElement serialize(TByteShortMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        TByteSetDecorator keys = new TByteSetDecorator(src.keySet());
        for (byte key : keys) {
            jmap.addProperty(Byte.toString(key), src.get(key));
        }
        
        return jmap;
    }
}