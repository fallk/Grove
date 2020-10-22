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

import gnu.trove.map.TFloatByteMap;
import gnu.trove.map.TFloatObjectMap;
import gnu.trove.map.hash.TFloatByteHashMap;
import gnu.trove.map.hash.TFloatObjectHashMap;

// Tokens:
// float, byte = byte, char, etc.
// F, B = B, C, etc.
// Float, Byte = Byte, Char, etc.
// Float, Byte = Byte, Character, etc.
// FloatByte = ByteByte, ByteChar, etc.
public final class TestGroveMapFB {
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
        byte[] r = new byte[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (float) (rand.nextDouble() * 9999);
            r[i] = (byte) ((byte) (rand.nextDouble() * 9999)+127);
        }
        TFloatByteMap list = new TFloatByteHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }

        String s = gson.toJson(list, TFloatByteMap.class);
        System.out.println(s);
        TFloatByteMap after = gson.fromJson(s, TFloatByteMap.class);

        Assert.assertEquals(list.size(), after.size());

        list.forEachEntry((a, b) -> {
            AssertUtil.equals(after.get(a), b);
            return true;
        });
    }
}
