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

import gnu.trove.decorator.TFloatSetDecorator;
import gnu.trove.map.TFloatShortMap;
import gnu.trove.map.hash.TFloatShortHashMap;

//float,short
public final class MTroveFloatShortMapTypeAdapter implements JsonSerializer<TFloatShortMap>, JsonDeserializer<TFloatShortMap> {
    // guava says to implement this differently, check doc if this dosnt work

    public TFloatShortMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TFloatShortMap map = new TFloatShortHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Float.parseFloat(el.getKey()), Short.parseShort(el.getValue().getAsString()));
        }
        return map;
    }
    
    public JsonElement serialize(TFloatShortMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        TFloatSetDecorator keys = new TFloatSetDecorator(src.keySet());
        for (float key : keys) {
            jmap.addProperty(Float.toString(key), Short.toString(src.get(key)));
        }
        
        return jmap;
    }
}