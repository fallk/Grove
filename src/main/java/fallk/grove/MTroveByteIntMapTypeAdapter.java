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

import gnu.trove.decorator.TByteSetDecorator;
import gnu.trove.map.TByteIntMap;
import gnu.trove.map.hash.TByteIntHashMap;

//byte,int
public final class MTroveByteIntMapTypeAdapter implements JsonSerializer<TByteIntMap>, JsonDeserializer<TByteIntMap> {
    // guava says to implement this differently, check doc if this dosnt work

    public TByteIntMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TByteIntMap map = new TByteIntHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Byte.parseByte(el.getKey()), Int.parseInt(el.getValue().getAsString()));
        }
        return map;
    }
    
    public JsonElement serialize(TByteIntMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        TByteSetDecorator keys = new TByteSetDecorator(src.keySet());
        for (byte key : keys) {
            jmap.addProperty(Byte.toString(key), Int.toString(src.get(key)));
        }
        
        return jmap;
    }
}