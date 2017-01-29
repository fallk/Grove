// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import gnu.trove.map.TCharIntMap;
import gnu.trove.map.hash.TCharIntHashMap;

//char
public class MTroveCharIntMapTest {

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
        int[] r = new int[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (char) (rand.nextDouble() * 9999);
            r[i] = (int) ((int) (rand.nextDouble() * 9999)+127);
        }
        TCharIntMap list = new TCharIntHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, TCharIntMap.class);
        System.out.println(s);
        TCharIntMap after = gson.fromJson(s, TCharIntMap.class);

        CharAsserter.arrayEquals(list.keys(), after.keys());
        IntAsserter.arrayEquals(list.values(), after.values());
    }
}
