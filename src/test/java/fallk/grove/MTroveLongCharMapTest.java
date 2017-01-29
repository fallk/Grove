// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import gnu.trove.map.TLongCharMap;
import gnu.trove.map.hash.TLongCharHashMap;

//long
public class MTroveLongCharMapTest {

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

        long[] f = new long[300];
        char[] r = new char[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (long) (rand.nextDouble() * 9999);
            r[i] = (char) ((char) (rand.nextDouble() * 9999)+127);
        }
        TLongCharMap list = new TLongCharHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, TLongCharMap.class);
        System.out.println(s);
        TLongCharMap after = gson.fromJson(s, TLongCharMap.class);

        LongAsserter.arrayEquals(list.keys(), after.keys());
        CharAsserter.arrayEquals(list.values(), after.values());
    }
}
