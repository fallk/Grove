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
import gnu.trove.map.TLongDoubleMap;
import gnu.trove.map.hash.TLongDoubleHashMap;

//long,double
public final class MTroveLongDoubleMapTypeAdapter implements JsonSerializer<TLongDoubleMap>, JsonDeserializer<TLongDoubleMap> {
    // guava says to implement this differently, check doc if this dosnt work

    public TLongDoubleMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TLongDoubleMap map = new TLongDoubleHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Long.parseLong(el.getKey()), Convert.getAsDouble(el.getValue()));
        }
        return map;
    }
    
    public JsonElement serialize(TLongDoubleMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        TLongSetDecorator keys = new TLongSetDecorator(src.keySet());
        for (long key : keys) {
            jmap.addProperty(Long.toString(key), src.get(key));
        }
        
        return jmap;
    }
}