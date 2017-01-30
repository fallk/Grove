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

import gnu.trove.map.TByteFloatMap;
import gnu.trove.map.TByteObjectMap;
import gnu.trove.map.hash.TByteFloatHashMap;
import gnu.trove.map.hash.TByteObjectHashMap;

//byte
public class MTroveByteFloatMapTest {

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

        byte[] f = new byte[300];
        float[] r = new float[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (byte) (rand.nextDouble() * 9999);
            r[i] = (float) ((float) (rand.nextDouble() * 9999)+127);
        }
        TByteFloatMap list = new TByteFloatHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }
        
        String s = gson.toJson(list, TByteFloatMap.class);
        System.out.println(s);
        TByteFloatMap after = gson.fromJson(s, TByteFloatMap.class);

        ByteAsserter.arrayEquals(list.keys(), after.keys());
        FloatAsserter.arrayEquals(list.values(), after.values());
    }
}
