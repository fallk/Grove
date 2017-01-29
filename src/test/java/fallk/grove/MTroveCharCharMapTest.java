// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import gnu.trove.map.TCharCharMap;
import gnu.trove.map.hash.TCharCharHashMap;

//char
public class MTroveCharCharMapTest {

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
        char[] r = new char[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (char) (rand.nextDouble() * 9999);
            r[i] = (char) ((char) (rand.nextDouble() * 9999)+127);
        }
        TCharCharMap list = new TCharCharHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, TCharCharMap.class);
        System.out.println(s);
        TCharCharMap after = gson.fromJson(s, TCharCharMap.class);

        CharAsserter.arrayEquals(list.keys(), after.keys());
        CharAsserter.arrayEquals(list.values(), after.values());
    }
}
