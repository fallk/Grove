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

import gnu.trove.map.TCharLongMap;
import gnu.trove.map.TCharObjectMap;
import gnu.trove.map.hash.TCharLongHashMap;
import gnu.trove.map.hash.TCharObjectHashMap;

// Tokens:
// char, long = byte, char, etc.
// C, L = B, C, etc.
// Char, Long = Byte, Char, etc.
// Character, Long = Byte, Character, etc.
// CharLong = ByteByte, ByteChar, etc.
public final class TestGroveMapCL {
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

        char[] f = new char[300];
        long[] r = new long[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (char) (rand.nextDouble() * 9999);
            r[i] = (long) ((long) (rand.nextDouble() * 9999)+127);
        }
        TCharLongMap list = new TCharLongHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }

        String s = gson.toJson(list, TCharLongMap.class);
        System.out.println(s);
        TCharLongMap after = gson.fromJson(s, TCharLongMap.class);

        Assert.assertEquals(list.size(), after.size());

        list.forEachEntry((a, b) -> {
            AssertUtil.equals(after.get(a), b);
            return true;
        });
    }
}
