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

import gnu.trove.map.TCharShortMap;
import gnu.trove.map.TCharObjectMap;
import gnu.trove.map.hash.TCharShortHashMap;
import gnu.trove.map.hash.TCharObjectHashMap;

//char
public class MTroveCharShortMapTest {

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

        char[] f = new char[300];
        short[] r = new short[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (char) (rand.nextDouble() * 9999);
            r[i] = (short) ((short) (rand.nextDouble() * 9999)+127);
        }
        TCharShortMap list = new TCharShortHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, TCharShortMap.class);
        System.out.println(s);
        TCharShortMap after = gson.fromJson(s, TCharShortMap.class);

        CharAsserter.arrayEquals(list.keys(), after.keys());
        ShortAsserter.arrayEquals(list.values(), after.values());
    }
}
