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
import gnu.trove.map.TShortCharMap;
import gnu.trove.map.hash.TShortCharHashMap;

//short,char
public final class MTroveShortCharMapTypeAdapter implements JsonSerializer<TShortCharMap>, JsonDeserializer<TShortCharMap> {
    // guava says to implement this differently, check doc if this dosnt work

    public TShortCharMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TShortCharMap map = new TShortCharHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Short.parseShort(el.getKey()), Char.parseChar(el.getValue().getAsString()));
        }
        return map;
    }
    
    public JsonElement serialize(TShortCharMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        TShortSetDecorator keys = new TShortSetDecorator(src.keySet());
        for (short key : keys) {
            jmap.addProperty(Short.toString(key), Char.toString(src.get(key)));
        }
        
        return jmap;
    }
}