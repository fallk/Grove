// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import gnu.trove.map.TIntFloatMap;
import gnu.trove.map.hash.TIntFloatHashMap;

//int
public class MTroveIntFloatMapTest {

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
        float[] r = new float[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (int) (rand.nextDouble() * 9999);
            r[i] = (float) ((float) (rand.nextDouble() * 9999)+127);
        }
        TIntFloatMap list = new TIntFloatHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, TIntFloatMap.class);
        System.out.println(s);
        TIntFloatMap after = gson.fromJson(s, TIntFloatMap.class);

        IntAsserter.arrayEquals(list.keys(), after.keys());
        FloatAsserter.arrayEquals(list.values(), after.values());
    }
}
