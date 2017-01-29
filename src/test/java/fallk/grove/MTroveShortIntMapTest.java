// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import gnu.trove.map.TShortIntMap;
import gnu.trove.map.hash.TShortIntHashMap;

//short
public class MTroveShortIntMapTest {

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

        short[] f = new short[300];
        int[] r = new int[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (short) (rand.nextDouble() * 9999);
            r[i] = (int) ((int) (rand.nextDouble() * 9999)+127);
        }
        TShortIntMap list = new TShortIntHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, TShortIntMap.class);
        System.out.println(s);
        TShortIntMap after = gson.fromJson(s, TShortIntMap.class);

        ShortAsserter.arrayEquals(list.keys(), after.keys());
        IntAsserter.arrayEquals(list.values(), after.values());
    }
}
