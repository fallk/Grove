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

import gnu.trove.map.TByteDoubleMap;
import gnu.trove.map.TByteObjectMap;
import gnu.trove.map.hash.TByteDoubleHashMap;
import gnu.trove.map.hash.TByteObjectHashMap;

// Tokens:
// byte, double = byte, char, etc.
// B, D = B, C, etc.
// Byte, Double = Byte, Char, etc.
// Byte, Double = Byte, Character, etc.
// ByteDouble = ByteByte, ByteChar, etc.
public final class TestGroveMapBD {
    private Random rand;

    @Before
    public void setUp() throws Exception {
        rand = new Random(4); // chosen by fair dice roll. guaranteed to be random.
    }

    @After
    public void tearDown() throws Exception {
    }

    @SuppressWarnings("all")
    @Test
    public void test() {
        Gson gson = new GroveBuilder().create();

        byte[] f = new byte[300];
        double[] r = new double[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (byte) (rand.nextDouble() * 9999);
            r[i] = (double) ((double) (rand.nextDouble() * 9999)+127);
        }
        TByteDoubleMap list = new TByteDoubleHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }

        String s = gson.toJson(list, TByteDoubleMap.class);
        System.out.println(s);
        TByteDoubleMap after = gson.fromJson(s, TByteDoubleMap.class);

        Assert.assertEquals(list.size(), after.size());

        list.forEachEntry((a, b) -> {
            AssertUtil.equals(after.get(a), b);
            return true;
        });
    }
}
