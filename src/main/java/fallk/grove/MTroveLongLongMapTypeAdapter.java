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
import gnu.trove.map.TLongLongMap;
import gnu.trove.map.hash.TLongLongHashMap;

//long,long
public final class MTroveLongLongMapTypeAdapter implements JsonSerializer<TLongLongMap>, JsonDeserializer<TLongLongMap> {
    // guava says to implement this differently, check doc if this dosnt work

    public TLongLongMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TLongLongMap map = new TLongLongHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Long.parseLong(el.getKey()), Long.parseLong(el.getValue().getAsString()));
        }
        return map;
    }
    
    public JsonElement serialize(TLongLongMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        TLongSetDecorator keys = new TLongSetDecorator(src.keySet());
        for (long key : keys) {
            jmap.addProperty(Long.toString(key), Long.toString(src.get(key)));
        }
        
        return jmap;
    }
}