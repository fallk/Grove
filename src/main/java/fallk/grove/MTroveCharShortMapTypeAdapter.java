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

import gnu.trove.decorator.TCharSetDecorator;
import gnu.trove.map.TCharShortMap;
import gnu.trove.map.hash.TCharShortHashMap;

//char,short
public final class MTroveCharShortMapTypeAdapter implements JsonSerializer<TCharShortMap>, JsonDeserializer<TCharShortMap> {
    // guava says to implement this differently, check doc if this dosnt work

    public TCharShortMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TCharShortMap map = new TCharShortHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Char.parseChar(el.getKey()), Convert.getAsShort(el.getValue()));
        }
        return map;
    }
    
    public JsonElement serialize(TCharShortMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        TCharSetDecorator keys = new TCharSetDecorator(src.keySet());
        for (char key : keys) {
            jmap.addProperty(Char.toString(key), src.get(key));
        }
        
        return jmap;
    }
}