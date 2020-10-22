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

import gnu.trove.map.TIntCharMap;
import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntCharHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;

// Tokens:
// int, char = byte, char, etc.
// I, C = B, C, etc.
// Int, Char = Byte, Char, etc.
// Integer, Character = Byte, Character, etc.
// IntChar = ByteByte, ByteChar, etc.
public final class TestGroveMapIC {
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
        char[] r = new char[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (int) (rand.nextDouble() * 9999);
            r[i] = (char) ((char) (rand.nextDouble() * 9999)+127);
        }
        TIntCharMap list = new TIntCharHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }

        String s = gson.toJson(list, TIntCharMap.class);
        System.out.println(s);
        TIntCharMap after = gson.fromJson(s, TIntCharMap.class);

        Assert.assertEquals(list.size(), after.size());

        list.forEachEntry((a, b) -> {
            AssertUtil.equals(after.get(a), b);
            return true;
        });
    }
}
