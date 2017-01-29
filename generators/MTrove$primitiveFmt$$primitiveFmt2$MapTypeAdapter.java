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

import gnu.trove.decorator.T$primitiveFmt$SetDecorator;
import gnu.trove.map.T$primitiveFmt$$primitiveFmt2$Map;
import gnu.trove.map.hash.T$primitiveFmt$$primitiveFmt2$HashMap;

//$primitive$,$primitive2$
public final class MTrove$primitiveFmt$$primitiveFmt2$MapTypeAdapter implements JsonSerializer<T$primitiveFmt$$primitiveFmt2$Map>, JsonDeserializer<T$primitiveFmt$$primitiveFmt2$Map> {
    // guava says to implement this differently, check doc if this dosnt work

    public T$primitiveFmt$$primitiveFmt2$Map deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jmap = json.getAsJsonObject();
        T$primitiveFmt$$primitiveFmt2$Map map = new T$primitiveFmt$$primitiveFmt2$HashMap(jmap.size());

        for (Entry<String, JsonElement> el : jmap.entrySet()) {
            map.put($primitiveFmt$.parse$primitiveFmt$(el.getKey()), Convert.getAs$primitiveFmt2$(el.getValue()));
        }
        return map;
    }
    
    public JsonElement serialize(T$primitiveFmt$$primitiveFmt2$Map src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject jmap = new JsonObject();

        T$primitiveFmt$SetDecorator keys = new T$primitiveFmt$SetDecorator(src.keySet());
        for ($primitive$ key : keys) {
            jmap.addProperty($primitiveFmt$.toString(key), src.get(key));
        }
        
        return jmap;
    }
}