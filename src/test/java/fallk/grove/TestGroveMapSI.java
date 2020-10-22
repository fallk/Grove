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

import gnu.trove.map.TShortIntMap;
import gnu.trove.map.TShortObjectMap;
import gnu.trove.map.hash.TShortIntHashMap;
import gnu.trove.map.hash.TShortObjectHashMap;

// Tokens:
// short, int = byte, char, etc.
// S, I = B, C, etc.
// Short, Int = Byte, Char, etc.
// Short, Integer = Byte, Character, etc.
// ShortInt = ByteByte, ByteChar, etc.
public final class TestGroveMapSI {
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
        int[] r = new int[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (short) (rand.nextDouble() * 9999);
            r[i] = (int) ((int) (rand.nextDouble() * 9999)+127);
        }
        TShortIntMap list = new TShortIntHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }

        String s = gson.toJson(list, TShortIntMap.class);
        System.out.println(s);
        TShortIntMap after = gson.fromJson(s, TShortIntMap.class);

        Assert.assertEquals(list.size(), after.size());

        list.forEachEntry((a, b) -> {
            AssertUtil.equals(after.get(a), b);
            return true;
        });
    }
}
