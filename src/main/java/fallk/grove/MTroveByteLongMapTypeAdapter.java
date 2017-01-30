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
import gnu.trove.map.TByteLongMap;
import gnu.trove.map.hash.TByteLongHashMap;

//byte,long
public final class MTroveByteLongMapTypeAdapter implements JsonSerializer<TByteLongMap>, JsonDeserializer<TByteLongMap> {
    // guava says to implement this differently, check doc if this dosnt work

    public TByteLongMap deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        TByteLongMap map = new TByteLongHashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put(Byte.parseByte(el.getKey()), Long.parseLong(el.getValue().getAsString()));
        }
        return map;
    }
    
    public JsonElement serialize(TByteLongMap src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        TByteSetDecorator keys = new TByteSetDecorator(src.keySet());
        for (byte key : keys) {
            jmap.addProperty(Byte.toString(key), Long.toString(src.get(key)));
        }
        
        return jmap;
    }
}