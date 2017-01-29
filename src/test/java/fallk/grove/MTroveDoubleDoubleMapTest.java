// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import gnu.trove.map.TDoubleDoubleMap;
import gnu.trove.map.hash.TDoubleDoubleHashMap;

//double
public class MTroveDoubleDoubleMapTest {

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
        double[] r = new double[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (double) (rand.nextDouble() * 9999);
            r[i] = (double) ((double) (rand.nextDouble() * 9999)+127);
        }
        TDoubleDoubleMap list = new TDoubleDoubleHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, TDoubleDoubleMap.class);
        System.out.println(s);
        TDoubleDoubleMap after = gson.fromJson(s, TDoubleDoubleMap.class);

        DoubleAsserter.arrayEquals(list.keys(), after.keys());
        DoubleAsserter.arrayEquals(list.values(), after.values());
    }
}
