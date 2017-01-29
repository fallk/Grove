// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import gnu.trove.map.TLongFloatMap;
import gnu.trove.map.hash.TLongFloatHashMap;

//long
public class MTroveLongFloatMapTest {

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

        long[] f = new long[300];
        float[] r = new float[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (long) (rand.nextDouble() * 9999);
            r[i] = (float) ((float) (rand.nextDouble() * 9999)+127);
        }
        TLongFloatMap list = new TLongFloatHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, TLongFloatMap.class);
        System.out.println(s);
        TLongFloatMap after = gson.fromJson(s, TLongFloatMap.class);

        LongAsserter.arrayEquals(list.keys(), after.keys());
        FloatAsserter.arrayEquals(list.values(), after.values());
    }
}
