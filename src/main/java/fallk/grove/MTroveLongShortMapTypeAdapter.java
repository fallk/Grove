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

import gnu.trove.decorator.TLongSetDecorator;
import gnu.trove.map.TLongShortMap;
import gnu.trove.map.hash.TLongShortHashMap;

//long,short
public final class MTroveLongShortMapTypeAdapter implements JsonSerializer<TLongShortMap>, JsonDeserializer<TLongShortMap> {
    // guava says to implement this differently, check doc if this dosnt work

    public TLongShortMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TLongShortMap map = new TLongShortHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Long.parseLong(el.getKey()), Short.parseShort(el.getValue().getAsString()));
        }
        return map;
    }
    
    public JsonElement serialize(TLongShortMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        TLongSetDecorator keys = new TLongSetDecorator(src.keySet());
        for (long key : keys) {
            jmap.addProperty(Long.toString(key), Short.toString(src.get(key)));
        }
        
        return jmap;
    }
}