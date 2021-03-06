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

import gnu.trove.map.TByteLongMap;
import gnu.trove.map.TByteObjectMap;
import gnu.trove.map.hash.TByteLongHashMap;
import gnu.trove.map.hash.TByteObjectHashMap;

// Tokens:
// byte, long = byte, char, etc.
// B, L = B, C, etc.
// Byte, Long = Byte, Char, etc.
// Byte, Long = Byte, Character, etc.
// ByteLong = ByteByte, ByteChar, etc.
public final class TestGroveMapBL {
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
        long[] r = new long[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (byte) (rand.nextDouble() * 9999);
            r[i] = (long) ((long) (rand.nextDouble() * 9999)+127);
        }
        TByteLongMap list = new TByteLongHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }

        String s = gson.toJson(list, TByteLongMap.class);
        System.out.println(s);
        TByteLongMap after = gson.fromJson(s, TByteLongMap.class);

        Assert.assertEquals(list.size(), after.size());

        list.forEachEntry((a, b) -> {
            AssertUtil.equals(after.get(a), b);
            return true;
        });
    }
}
