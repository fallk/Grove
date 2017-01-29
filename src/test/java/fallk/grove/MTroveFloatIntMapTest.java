// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import gnu.trove.map.TFloatIntMap;
import gnu.trove.map.hash.TFloatIntHashMap;

//float
public class MTroveFloatIntMapTest {

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
        int[] r = new int[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (float) (rand.nextDouble() * 9999);
            r[i] = (int) ((int) (rand.nextDouble() * 9999)+127);
        }
        TFloatIntMap list = new TFloatIntHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, TFloatIntMap.class);
        System.out.println(s);
        TFloatIntMap after = gson.fromJson(s, TFloatIntMap.class);

        FloatAsserter.arrayEquals(list.keys(), after.keys());
        IntAsserter.arrayEquals(list.values(), after.values());
    }
}
