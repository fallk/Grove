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

import gnu.trove.map.TShortDoubleMap;
import gnu.trove.map.TShortObjectMap;
import gnu.trove.map.hash.TShortDoubleHashMap;
import gnu.trove.map.hash.TShortObjectHashMap;

// Tokens:
// short, double = byte, char, etc.
// S, D = B, C, etc.
// Short, Double = Byte, Char, etc.
// Short, Double = Byte, Character, etc.
// ShortDouble = ByteByte, ByteChar, etc.
public final class TestGroveMapSD {
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

        short[] f = new short[300];
        double[] r = new double[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (short) (rand.nextDouble() * 9999);
            r[i] = (double) ((double) (rand.nextDouble() * 9999)+127);
        }
        TShortDoubleMap list = new TShortDoubleHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }

        String s = gson.toJson(list, TShortDoubleMap.class);
        System.out.println(s);
        TShortDoubleMap after = gson.fromJson(s, TShortDoubleMap.class);

        Assert.assertEquals(list.size(), after.size());

        list.forEachEntry((a, b) -> {
            AssertUtil.equals(after.get(a), b);
            return true;
        });
    }
}
