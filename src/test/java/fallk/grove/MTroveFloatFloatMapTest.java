// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import gnu.trove.map.TFloatFloatMap;
import gnu.trove.map.hash.TFloatFloatHashMap;

//float
public class MTroveFloatFloatMapTest {

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
        float[] r = new float[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (float) (rand.nextDouble() * 9999);
            r[i] = (float) ((float) (rand.nextDouble() * 9999)+127);
        }
        TFloatFloatMap list = new TFloatFloatHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, TFloatFloatMap.class);
        System.out.println(s);
        TFloatFloatMap after = gson.fromJson(s, TFloatFloatMap.class);

        FloatAsserter.arrayEquals(list.keys(), after.keys());
        FloatAsserter.arrayEquals(list.values(), after.values());
    }
}
