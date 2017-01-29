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
import gnu.trove.map.TLongIntMap;
import gnu.trove.map.hash.TLongIntHashMap;

//long,int
public final class MTroveLongIntMapTypeAdapter implements JsonSerializer<TLongIntMap>, JsonDeserializer<TLongIntMap> {
    // guava says to implement this differently, check doc if this dosnt work

    public TLongIntMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TLongIntMap map = new TLongIntHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Long.parseLong(el.getKey()), Convert.getAsInt(el.getValue()));
        }
        return map;
    }
    
    public JsonElement serialize(TLongIntMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        TLongSetDecorator keys = new TLongSetDecorator(src.keySet());
        for (long key : keys) {
            jmap.addProperty(Long.toString(key), src.get(key));
        }
        
        return jmap;
    }
}