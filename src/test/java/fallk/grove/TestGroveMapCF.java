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

import gnu.trove.map.TCharFloatMap;
import gnu.trove.map.TCharObjectMap;
import gnu.trove.map.hash.TCharFloatHashMap;
import gnu.trove.map.hash.TCharObjectHashMap;

// Tokens:
// char, float = byte, char, etc.
// C, F = B, C, etc.
// Char, Float = Byte, Char, etc.
// Character, Float = Byte, Character, etc.
// CharFloat = ByteByte, ByteChar, etc.
public final class TestGroveMapCF {
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
        float[] r = new float[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (char) (rand.nextDouble() * 9999);
            r[i] = (float) ((float) (rand.nextDouble() * 9999)+127);
        }
        TCharFloatMap list = new TCharFloatHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }

        String s = gson.toJson(list, TCharFloatMap.class);
        System.out.println(s);
        TCharFloatMap after = gson.fromJson(s, TCharFloatMap.class);

        Assert.assertEquals(list.size(), after.size());

        list.forEachEntry((a, b) -> {
            AssertUtil.equals(after.get(a), b);
            return true;
        });
    }
}
