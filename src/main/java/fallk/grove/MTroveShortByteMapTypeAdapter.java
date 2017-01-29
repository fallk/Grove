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
import gnu.trove.map.TShortByteMap;
import gnu.trove.map.hash.TShortByteHashMap;

//short,byte
public final class MTroveShortByteMapTypeAdapter implements JsonSerializer<TShortByteMap>, JsonDeserializer<TShortByteMap> {
    // guava says to implement this differently, check doc if this dosnt work

    public TShortByteMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TShortByteMap map = new TShortByteHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Short.parseShort(el.getKey()), Convert.getAsByte(el.getValue()));
        }
        return map;
    }
    
    public JsonElement serialize(TShortByteMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        TShortSetDecorator keys = new TShortSetDecorator(src.keySet());
        for (short key : keys) {
            jmap.addProperty(Short.toString(key), src.get(key));
        }
        
        return jmap;
    }
}