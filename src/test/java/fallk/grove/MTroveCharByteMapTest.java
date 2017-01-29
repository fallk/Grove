// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import gnu.trove.map.TCharByteMap;
import gnu.trove.map.TCharObjectMap;
import gnu.trove.map.hash.TCharByteHashMap;
import gnu.trove.map.hash.TCharObjectHashMap;

//char
public class MTroveCharByteMapTest {

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
        byte[] r = new byte[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (char) (rand.nextDouble() * 9999);
            r[i] = (byte) ((byte) (rand.nextDouble() * 9999)+127);
        }
        TCharByteMap list = new TCharByteHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, TCharByteMap.class);
        System.out.println(s);
        TCharByteMap after = gson.fromJson(s, TCharByteMap.class);

        CharAsserter.arrayEquals(list.keys(), after.keys());
        ByteAsserter.arrayEquals(list.values(), after.values());
    }
}
