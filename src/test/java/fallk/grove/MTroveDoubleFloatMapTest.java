// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import gnu.trove.map.TDoubleFloatMap;
import gnu.trove.map.hash.TDoubleFloatHashMap;

//double
public class MTroveDoubleFloatMapTest {

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
        float[] r = new float[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (double) (rand.nextDouble() * 9999);
            r[i] = (float) ((float) (rand.nextDouble() * 9999)+127);
        }
        TDoubleFloatMap list = new TDoubleFloatHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, TDoubleFloatMap.class);
        System.out.println(s);
        TDoubleFloatMap after = gson.fromJson(s, TDoubleFloatMap.class);

        DoubleAsserter.arrayEquals(list.keys(), after.keys());
        FloatAsserter.arrayEquals(list.values(), after.values());
    }
}
