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

import gnu.trove.map.TLongShortMap;
import gnu.trove.map.TLongObjectMap;
import gnu.trove.map.hash.TLongShortHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;

// Tokens:
// long, short = byte, char, etc.
// L, S = B, C, etc.
// Long, Short = Byte, Char, etc.
// Long, Short = Byte, Character, etc.
// LongShort = ByteByte, ByteChar, etc.
public final class TestGroveMapLS {
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

        long[] f = new long[300];
        short[] r = new short[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (long) (rand.nextDouble() * 9999);
            r[i] = (short) ((short) (rand.nextDouble() * 9999)+127);
        }
        TLongShortMap list = new TLongShortHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }

        String s = gson.toJson(list, TLongShortMap.class);
        System.out.println(s);
        TLongShortMap after = gson.fromJson(s, TLongShortMap.class);

        Assert.assertEquals(list.size(), after.size());

        list.forEachEntry((a, b) -> {
            AssertUtil.equals(after.get(a), b);
            return true;
        });
    }
}
