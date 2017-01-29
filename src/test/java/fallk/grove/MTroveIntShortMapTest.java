// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import gnu.trove.map.TIntShortMap;
import gnu.trove.map.hash.TIntShortHashMap;

//int
public class MTroveIntShortMapTest {

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
        short[] r = new short[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (int) (rand.nextDouble() * 9999);
            r[i] = (short) ((short) (rand.nextDouble() * 9999)+127);
        }
        TIntShortMap list = new TIntShortHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, TIntShortMap.class);
        System.out.println(s);
        TIntShortMap after = gson.fromJson(s, TIntShortMap.class);

        IntAsserter.arrayEquals(list.keys(), after.keys());
        ShortAsserter.arrayEquals(list.values(), after.values());
    }
}
