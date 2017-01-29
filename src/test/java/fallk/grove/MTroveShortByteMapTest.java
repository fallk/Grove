// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import gnu.trove.map.TShortByteMap;
import gnu.trove.map.hash.TShortByteHashMap;

//short
public class MTroveShortByteMapTest {

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
        byte[] r = new byte[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (short) (rand.nextDouble() * 9999);
            r[i] = (byte) ((byte) (rand.nextDouble() * 9999)+127);
        }
        TShortByteMap list = new TShortByteHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, TShortByteMap.class);
        System.out.println(s);
        TShortByteMap after = gson.fromJson(s, TShortByteMap.class);

        ShortAsserter.arrayEquals(list.keys(), after.keys());
        ByteAsserter.arrayEquals(list.values(), after.values());
    }
}
