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

import gnu.trove.map.TCharCharMap;
import gnu.trove.map.TCharObjectMap;
import gnu.trove.map.hash.TCharCharHashMap;
import gnu.trove.map.hash.TCharObjectHashMap;

// Tokens:
// char, char = byte, char, etc.
// C, C = B, C, etc.
// Char, Char = Byte, Char, etc.
// Character, Character = Byte, Character, etc.
// CharChar = ByteByte, ByteChar, etc.
public final class TestGroveMapCC {
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
        char[] r = new char[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (char) (rand.nextDouble() * 9999);
            r[i] = (char) ((char) (rand.nextDouble() * 9999)+127);
        }
        TCharCharMap list = new TCharCharHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }

        String s = gson.toJson(list, TCharCharMap.class);
        System.out.println(s);
        TCharCharMap after = gson.fromJson(s, TCharCharMap.class);

        Assert.assertEquals(list.size(), after.size());

        list.forEachEntry((a, b) -> {
            AssertUtil.equals(after.get(a), b);
            return true;
        });
    }
}
