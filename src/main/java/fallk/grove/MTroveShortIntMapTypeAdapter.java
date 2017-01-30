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
import gnu.trove.map.TShortIntMap;
import gnu.trove.map.hash.TShortIntHashMap;

//short,int
public final class MTroveShortIntMapTypeAdapter implements JsonSerializer<TShortIntMap>, JsonDeserializer<TShortIntMap> {
    // guava says to implement this differently, check doc if this dosnt work

    public TShortIntMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TShortIntMap map = new TShortIntHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Short.parseShort(el.getKey()), Int.parseInt(el.getValue().getAsString()));
        }
        return map;
    }
    
    public JsonElement serialize(TShortIntMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        TShortSetDecorator keys = new TShortSetDecorator(src.keySet());
        for (short key : keys) {
            jmap.addProperty(Short.toString(key), Int.toString(src.get(key)));
        }
        
        return jmap;
    }
}