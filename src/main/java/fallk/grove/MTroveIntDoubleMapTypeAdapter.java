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

import gnu.trove.decorator.TIntSetDecorator;
import gnu.trove.map.TIntDoubleMap;
import gnu.trove.map.hash.TIntDoubleHashMap;

//int,double
public final class MTroveIntDoubleMapTypeAdapter implements JsonSerializer<TIntDoubleMap>, JsonDeserializer<TIntDoubleMap> {
    // guava says to implement this differently, check doc if this dosnt work

    public TIntDoubleMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TIntDoubleMap map = new TIntDoubleHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Int.parseInt(el.getKey()), Convert.getAsDouble(el.getValue()));
        }
        return map;
    }
    
    public JsonElement serialize(TIntDoubleMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        TIntSetDecorator keys = new TIntSetDecorator(src.keySet());
        for (int key : keys) {
            jmap.addProperty(Int.toString(key), src.get(key));
        }
        
        return jmap;
    }
}