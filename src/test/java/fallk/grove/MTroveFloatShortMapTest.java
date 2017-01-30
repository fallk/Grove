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

import gnu.trove.map.TFloatShortMap;
import gnu.trove.map.TFloatObjectMap;
import gnu.trove.map.hash.TFloatShortHashMap;
import gnu.trove.map.hash.TFloatObjectHashMap;

//float
public class MTroveFloatShortMapTest {

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

        float[] f = new float[300];
        short[] r = new short[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (float) (rand.nextDouble() * 9999);
            r[i] = (short) ((short) (rand.nextDouble() * 9999)+127);
        }
        TFloatShortMap list = new TFloatShortHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, TFloatShortMap.class);
        System.out.println(s);
        TFloatShortMap after = gson.fromJson(s, TFloatShortMap.class);

        FloatAsserter.arrayEquals(list.keys(), after.keys());
        ShortAsserter.arrayEquals(list.values(), after.values());
    }
}
