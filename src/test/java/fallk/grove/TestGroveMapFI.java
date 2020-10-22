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

import gnu.trove.map.TFloatIntMap;
import gnu.trove.map.TFloatObjectMap;
import gnu.trove.map.hash.TFloatIntHashMap;
import gnu.trove.map.hash.TFloatObjectHashMap;

// Tokens:
// float, int = byte, char, etc.
// F, I = B, C, etc.
// Float, Int = Byte, Char, etc.
// Float, Integer = Byte, Character, etc.
// FloatInt = ByteByte, ByteChar, etc.
public final class TestGroveMapFI {
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

        float[] f = new float[300];
        int[] r = new int[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (float) (rand.nextDouble() * 9999);
            r[i] = (int) ((int) (rand.nextDouble() * 9999)+127);
        }
        TFloatIntMap list = new TFloatIntHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }

        String s = gson.toJson(list, TFloatIntMap.class);
        System.out.println(s);
        TFloatIntMap after = gson.fromJson(s, TFloatIntMap.class);

        Assert.assertEquals(list.size(), after.size());

        list.forEachEntry((a, b) -> {
            AssertUtil.equals(after.get(a), b);
            return true;
        });
    }
}
