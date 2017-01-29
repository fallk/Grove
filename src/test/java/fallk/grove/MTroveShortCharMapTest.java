// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import gnu.trove.map.TShortCharMap;
import gnu.trove.map.hash.TShortCharHashMap;

//short
public class MTroveShortCharMapTest {

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
        char[] r = new char[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (short) (rand.nextDouble() * 9999);
            r[i] = (char) ((char) (rand.nextDouble() * 9999)+127);
        }
        TShortCharMap list = new TShortCharHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, TShortCharMap.class);
        System.out.println(s);
        TShortCharMap after = gson.fromJson(s, TShortCharMap.class);

        ShortAsserter.arrayEquals(list.keys(), after.keys());
        CharAsserter.arrayEquals(list.values(), after.values());
    }
}
