// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import gnu.trove.map.T$primitiveFmt$$primitiveFmt2$Map;
import gnu.trove.map.T$primitiveFmt$ObjectMap;
import gnu.trove.map.hash.T$primitiveFmt$$primitiveFmt2$HashMap;
import gnu.trove.map.hash.T$primitiveFmt$ObjectHashMap;

//$primitive$
public class MTrove$primitiveFmt$$primitiveFmt2$MapTest {

    private Random rand;

    @Before
    public void setUp() throws Exception {
        rand = new Random();
    }

    @After
    public void tearDown() throws Exception {
    }

    @SuppressWarnings("all")
    @Test
    public void test() {
        Gson gson = new GroveBuilder().create();

        $primitive$[] f = new $primitive$[300];
        $primitive2$[] r = new $primitive2$[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = ($primitive$) (rand.nextDouble() * 9999);
            r[i] = ($primitive2$) (($primitive2$) (rand.nextDouble() * 9999)+127);
        }
        T$primitiveFmt$$primitiveFmt2$Map list = new T$primitiveFmt$$primitiveFmt2$HashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, T$primitiveFmt$$primitiveFmt2$Map.class);
        System.out.println(s);
        T$primitiveFmt$$primitiveFmt2$Map after = gson.fromJson(s, T$primitiveFmt$$primitiveFmt2$Map.class);

        $primitiveFmt$Asserter.arrayEquals(list.keys(), after.keys());
        $primitiveFmt2$Asserter.arrayEquals(list.values(), after.values());
    }
}
