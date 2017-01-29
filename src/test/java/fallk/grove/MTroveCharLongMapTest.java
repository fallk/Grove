// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import gnu.trove.map.TCharLongMap;
import gnu.trove.map.hash.TCharLongHashMap;

//char
public class MTroveCharLongMapTest {

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
        long[] r = new long[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (char) (rand.nextDouble() * 9999);
            r[i] = (long) ((long) (rand.nextDouble() * 9999)+127);
        }
        TCharLongMap list = new TCharLongHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, TCharLongMap.class);
        System.out.println(s);
        TCharLongMap after = gson.fromJson(s, TCharLongMap.class);

        CharAsserter.arrayEquals(list.keys(), after.keys());
        LongAsserter.arrayEquals(list.values(), after.values());
    }
}
