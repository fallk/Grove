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

import gnu.trove.map.TDoubleCharMap;
import gnu.trove.map.TDoubleObjectMap;
import gnu.trove.map.hash.TDoubleCharHashMap;
import gnu.trove.map.hash.TDoubleObjectHashMap;

// Tokens:
// double, char = byte, char, etc.
// D, C = B, C, etc.
// Double, Char = Byte, Char, etc.
// Double, Character = Byte, Character, etc.
// DoubleChar = ByteByte, ByteChar, etc.
public final class TestGroveMapDC {
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
        char[] r = new char[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (double) (rand.nextDouble() * 9999);
            r[i] = (char) ((char) (rand.nextDouble() * 9999)+127);
        }
        TDoubleCharMap list = new TDoubleCharHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }

        String s = gson.toJson(list, TDoubleCharMap.class);
        System.out.println(s);
        TDoubleCharMap after = gson.fromJson(s, TDoubleCharMap.class);

        Assert.assertEquals(list.size(), after.size());

        list.forEachEntry((a, b) -> {
            AssertUtil.equals(after.get(a), b);
            return true;
        });
    }
}
