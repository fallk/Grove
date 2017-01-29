// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import gnu.trove.map.TLongByteMap;
import gnu.trove.map.hash.TLongByteHashMap;

//long
public class MTroveLongByteMapTest {

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
        byte[] r = new byte[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (long) (rand.nextDouble() * 9999);
            r[i] = (byte) ((byte) (rand.nextDouble() * 9999)+127);
        }
        TLongByteMap list = new TLongByteHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, TLongByteMap.class);
        System.out.println(s);
        TLongByteMap after = gson.fromJson(s, TLongByteMap.class);

        LongAsserter.arrayEquals(list.keys(), after.keys());
        ByteAsserter.arrayEquals(list.values(), after.values());
    }
}
