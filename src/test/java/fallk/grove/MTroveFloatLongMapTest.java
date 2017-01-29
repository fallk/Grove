// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import gnu.trove.map.TFloatLongMap;
import gnu.trove.map.hash.TFloatLongHashMap;

//float
public class MTroveFloatLongMapTest {

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
        long[] r = new long[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (float) (rand.nextDouble() * 9999);
            r[i] = (long) ((long) (rand.nextDouble() * 9999)+127);
        }
        TFloatLongMap list = new TFloatLongHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, TFloatLongMap.class);
        System.out.println(s);
        TFloatLongMap after = gson.fromJson(s, TFloatLongMap.class);

        FloatAsserter.arrayEquals(list.keys(), after.keys());
        LongAsserter.arrayEquals(list.values(), after.values());
    }
}
