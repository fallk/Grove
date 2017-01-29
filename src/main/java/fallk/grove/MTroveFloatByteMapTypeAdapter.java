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
import gnu.trove.map.TFloatByteMap;
import gnu.trove.map.hash.TFloatByteHashMap;

//float,byte
public final class MTroveFloatByteMapTypeAdapter implements JsonSerializer<TFloatByteMap>, JsonDeserializer<TFloatByteMap> {
    // guava says to implement this differently, check doc if this dosnt work

    public TFloatByteMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TFloatByteMap map = new TFloatByteHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Float.parseFloat(el.getKey()), Convert.getAsByte(el.getValue()));
        }
        return map;
    }
    
    public JsonElement serialize(TFloatByteMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        TFloatSetDecorator keys = new TFloatSetDecorator(src.keySet());
        for (float key : keys) {
            jmap.addProperty(Float.toString(key), src.get(key));
        }
        
        return jmap;
    }
}