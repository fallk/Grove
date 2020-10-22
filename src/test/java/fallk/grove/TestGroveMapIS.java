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

import gnu.trove.map.TIntShortMap;
import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntShortHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;

// Tokens:
// int, short = byte, char, etc.
// I, S = B, C, etc.
// Int, Short = Byte, Char, etc.
// Integer, Short = Byte, Character, etc.
// IntShort = ByteByte, ByteChar, etc.
public final class TestGroveMapIS {
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

        Assert.assertEquals(list.size(), after.size());

        list.forEachEntry((a, b) -> {
            AssertUtil.equals(after.get(a), b);
            return true;
        });
    }
}
