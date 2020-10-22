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

import gnu.trove.map.TShortByteMap;
import gnu.trove.map.TShortObjectMap;
import gnu.trove.map.hash.TShortByteHashMap;
import gnu.trove.map.hash.TShortObjectHashMap;

// Tokens:
// short, byte = byte, char, etc.
// S, B = B, C, etc.
// Short, Byte = Byte, Char, etc.
// Short, Byte = Byte, Character, etc.
// ShortByte = ByteByte, ByteChar, etc.
public final class TestGroveMapSB {
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
        byte[] r = new byte[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (short) (rand.nextDouble() * 9999);
            r[i] = (byte) ((byte) (rand.nextDouble() * 9999)+127);
        }
        TShortByteMap list = new TShortByteHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }

        String s = gson.toJson(list, TShortByteMap.class);
        System.out.println(s);
        TShortByteMap after = gson.fromJson(s, TShortByteMap.class);

        Assert.assertEquals(list.size(), after.size());

        list.forEachEntry((a, b) -> {
            AssertUtil.equals(after.get(a), b);
            return true;
        });
    }
}
