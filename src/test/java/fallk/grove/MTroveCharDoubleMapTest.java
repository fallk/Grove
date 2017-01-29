// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import gnu.trove.map.TCharDoubleMap;
import gnu.trove.map.hash.TCharDoubleHashMap;

//char
public class MTroveCharDoubleMapTest {

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
        double[] r = new double[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (char) (rand.nextDouble() * 9999);
            r[i] = (double) ((double) (rand.nextDouble() * 9999)+127);
        }
        TCharDoubleMap list = new TCharDoubleHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, TCharDoubleMap.class);
        System.out.println(s);
        TCharDoubleMap after = gson.fromJson(s, TCharDoubleMap.class);

        CharAsserter.arrayEquals(list.keys(), after.keys());
        DoubleAsserter.arrayEquals(list.values(), after.values());
    }
}
