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

import gnu.trove.map.TCharIntMap;
import gnu.trove.map.TCharObjectMap;
import gnu.trove.map.hash.TCharIntHashMap;
import gnu.trove.map.hash.TCharObjectHashMap;

// Tokens:
// char, int = byte, char, etc.
// C, I = B, C, etc.
// Char, Int = Byte, Char, etc.
// Character, Integer = Byte, Character, etc.
// CharInt = ByteByte, ByteChar, etc.
public final class TestGroveMapCI {
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
        int[] r = new int[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (char) (rand.nextDouble() * 9999);
            r[i] = (int) ((int) (rand.nextDouble() * 9999)+127);
        }
        TCharIntMap list = new TCharIntHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }

        String s = gson.toJson(list, TCharIntMap.class);
        System.out.println(s);
        TCharIntMap after = gson.fromJson(s, TCharIntMap.class);

        Assert.assertEquals(list.size(), after.size());

        list.forEachEntry((a, b) -> {
            AssertUtil.equals(after.get(a), b);
            return true;
        });
    }
}
