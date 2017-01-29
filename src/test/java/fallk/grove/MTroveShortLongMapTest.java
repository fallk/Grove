// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import gnu.trove.map.TShortLongMap;
import gnu.trove.map.hash.TShortLongHashMap;

//short
public class MTroveShortLongMapTest {

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
        long[] r = new long[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (short) (rand.nextDouble() * 9999);
            r[i] = (long) ((long) (rand.nextDouble() * 9999)+127);
        }
        TShortLongMap list = new TShortLongHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, TShortLongMap.class);
        System.out.println(s);
        TShortLongMap after = gson.fromJson(s, TShortLongMap.class);

        ShortAsserter.arrayEquals(list.keys(), after.keys());
        LongAsserter.arrayEquals(list.values(), after.values());
    }
}
