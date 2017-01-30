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

import gnu.trove.decorator.TDoubleSetDecorator;
import gnu.trove.map.TDoubleLongMap;
import gnu.trove.map.hash.TDoubleLongHashMap;

//double,long
public final class MTroveDoubleLongMapTypeAdapter implements JsonSerializer<TDoubleLongMap>, JsonDeserializer<TDoubleLongMap> {
    // guava says to implement this differently, check doc if this dosnt work

    public TDoubleLongMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TDoubleLongMap map = new TDoubleLongHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Double.parseDouble(el.getKey()), Long.parseLong(el.getValue().getAsString()));
        }
        return map;
    }
    
    public JsonElement serialize(TDoubleLongMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        TDoubleSetDecorator keys = new TDoubleSetDecorator(src.keySet());
        for (double key : keys) {
            jmap.addProperty(Double.toString(key), Long.toString(src.get(key)));
        }
        
        return jmap;
    }
}