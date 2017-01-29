// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import gnu.trove.map.TIntDoubleMap;
import gnu.trove.map.hash.TIntDoubleHashMap;

//int
public class MTroveIntDoubleMapTest {

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

        int[] f = new int[300];
        double[] r = new double[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (int) (rand.nextDouble() * 9999);
            r[i] = (double) ((double) (rand.nextDouble() * 9999)+127);
        }
        TIntDoubleMap list = new TIntDoubleHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, TIntDoubleMap.class);
        System.out.println(s);
        TIntDoubleMap after = gson.fromJson(s, TIntDoubleMap.class);

        IntAsserter.arrayEquals(list.keys(), after.keys());
        DoubleAsserter.arrayEquals(list.values(), after.values());
    }
}
