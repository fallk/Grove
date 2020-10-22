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

import gnu.trove.map.TDoubleShortMap;
import gnu.trove.map.TDoubleObjectMap;
import gnu.trove.map.hash.TDoubleShortHashMap;
import gnu.trove.map.hash.TDoubleObjectHashMap;

// Tokens:
// double, short = byte, char, etc.
// D, S = B, C, etc.
// Double, Short = Byte, Char, etc.
// Double, Short = Byte, Character, etc.
// DoubleShort = ByteByte, ByteChar, etc.
public final class TestGroveMapDS {
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

        double[] f = new double[300];
        short[] r = new short[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (double) (rand.nextDouble() * 9999);
            r[i] = (short) ((short) (rand.nextDouble() * 9999)+127);
        }
        TDoubleShortMap list = new TDoubleShortHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }

        String s = gson.toJson(list, TDoubleShortMap.class);
        System.out.println(s);
        TDoubleShortMap after = gson.fromJson(s, TDoubleShortMap.class);

        Assert.assertEquals(list.size(), after.size());

        list.forEachEntry((a, b) -> {
            AssertUtil.equals(after.get(a), b);
            return true;
        });
    }
}
