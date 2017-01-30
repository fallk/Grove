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
import gnu.trove.map.TIntCharMap;
import gnu.trove.map.hash.TIntCharHashMap;

//int,char
public final class MTroveIntCharMapTypeAdapter implements JsonSerializer<TIntCharMap>, JsonDeserializer<TIntCharMap> {
    // guava says to implement this differently, check doc if this dosnt work

    public TIntCharMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TIntCharMap map = new TIntCharHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Int.parseInt(el.getKey()), Char.parseChar(el.getValue().getAsString()));
        }
        return map;
    }
    
    public JsonElement serialize(TIntCharMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        TIntSetDecorator keys = new TIntSetDecorator(src.keySet());
        for (int key : keys) {
            jmap.addProperty(Int.toString(key), Char.toString(src.get(key)));
        }
        
        return jmap;
    }
}