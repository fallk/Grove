// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import gnu.trove.map.TDoubleLongMap;
import gnu.trove.map.hash.TDoubleLongHashMap;

//double
public class MTroveDoubleLongMapTest {

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

        double[] f = new double[300];
        long[] r = new long[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (double) (rand.nextDouble() * 9999);
            r[i] = (long) ((long) (rand.nextDouble() * 9999)+127);
        }
        TDoubleLongMap list = new TDoubleLongHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, TDoubleLongMap.class);
        System.out.println(s);
        TDoubleLongMap after = gson.fromJson(s, TDoubleLongMap.class);

        DoubleAsserter.arrayEquals(list.keys(), after.keys());
        LongAsserter.arrayEquals(list.values(), after.values());
    }
}
