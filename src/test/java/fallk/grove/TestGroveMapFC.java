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

import gnu.trove.map.TFloatCharMap;
import gnu.trove.map.TFloatObjectMap;
import gnu.trove.map.hash.TFloatCharHashMap;
import gnu.trove.map.hash.TFloatObjectHashMap;

// Tokens:
// float, char = byte, char, etc.
// F, C = B, C, etc.
// Float, Char = Byte, Char, etc.
// Float, Character = Byte, Character, etc.
// FloatChar = ByteByte, ByteChar, etc.
public final class TestGroveMapFC {
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
        char[] r = new char[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (float) (rand.nextDouble() * 9999);
            r[i] = (char) ((char) (rand.nextDouble() * 9999)+127);
        }
        TFloatCharMap list = new TFloatCharHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }

        String s = gson.toJson(list, TFloatCharMap.class);
        System.out.println(s);
        TFloatCharMap after = gson.fromJson(s, TFloatCharMap.class);

        Assert.assertEquals(list.size(), after.size());

        list.forEachEntry((a, b) -> {
            AssertUtil.equals(after.get(a), b);
            return true;
        });
    }
}
