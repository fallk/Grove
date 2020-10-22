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

import gnu.trove.map.TByteCharMap;
import gnu.trove.map.TByteObjectMap;
import gnu.trove.map.hash.TByteCharHashMap;
import gnu.trove.map.hash.TByteObjectHashMap;

// Tokens:
// byte, char = byte, char, etc.
// B, C = B, C, etc.
// Byte, Char = Byte, Char, etc.
// Byte, Character = Byte, Character, etc.
// ByteChar = ByteByte, ByteChar, etc.
public final class TestGroveMapBC {
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

        byte[] f = new byte[300];
        char[] r = new char[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (byte) (rand.nextDouble() * 9999);
            r[i] = (char) ((char) (rand.nextDouble() * 9999)+127);
        }
        TByteCharMap list = new TByteCharHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }

        String s = gson.toJson(list, TByteCharMap.class);
        System.out.println(s);
        TByteCharMap after = gson.fromJson(s, TByteCharMap.class);

        Assert.assertEquals(list.size(), after.size());

        list.forEachEntry((a, b) -> {
            AssertUtil.equals(after.get(a), b);
            return true;
        });
    }
}
