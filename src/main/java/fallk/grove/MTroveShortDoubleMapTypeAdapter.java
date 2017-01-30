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

import gnu.trove.decorator.TShortSetDecorator;
import gnu.trove.map.TShortDoubleMap;
import gnu.trove.map.hash.TShortDoubleHashMap;

//short,double
public final class MTroveShortDoubleMapTypeAdapter implements JsonSerializer<TShortDoubleMap>, JsonDeserializer<TShortDoubleMap> {
    // guava says to implement this differently, check doc if this dosnt work

    public TShortDoubleMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TShortDoubleMap map = new TShortDoubleHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Short.parseShort(el.getKey()), Double.parseDouble(el.getValue().getAsString()));
        }
        return map;
    }
    
    public JsonElement serialize(TShortDoubleMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        TShortSetDecorator keys = new TShortSetDecorator(src.keySet());
        for (short key : keys) {
            jmap.addProperty(Short.toString(key), Double.toString(src.get(key)));
        }
        
        return jmap;
    }
}