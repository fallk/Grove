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

import gnu.trove.map.TShortCharMap;
import gnu.trove.map.TShortObjectMap;
import gnu.trove.map.hash.TShortCharHashMap;
import gnu.trove.map.hash.TShortObjectHashMap;

// Tokens:
// short, char = byte, char, etc.
// S, C = B, C, etc.
// Short, Char = Byte, Char, etc.
// Short, Character = Byte, Character, etc.
// ShortChar = ByteByte, ByteChar, etc.
public final class TestGroveMapSC {
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
        char[] r = new char[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (short) (rand.nextDouble() * 9999);
            r[i] = (char) ((char) (rand.nextDouble() * 9999)+127);
        }
        TShortCharMap list = new TShortCharHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }

        String s = gson.toJson(list, TShortCharMap.class);
        System.out.println(s);
        TShortCharMap after = gson.fromJson(s, TShortCharMap.class);

        Assert.assertEquals(list.size(), after.size());

        list.forEachEntry((a, b) -> {
            AssertUtil.equals(after.get(a), b);
            return true;
        });
    }
}
