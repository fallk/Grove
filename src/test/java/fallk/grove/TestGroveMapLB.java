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

import gnu.trove.map.TLongByteMap;
import gnu.trove.map.TLongObjectMap;
import gnu.trove.map.hash.TLongByteHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;

// Tokens:
// long, byte = byte, char, etc.
// L, B = B, C, etc.
// Long, Byte = Byte, Char, etc.
// Long, Byte = Byte, Character, etc.
// LongByte = ByteByte, ByteChar, etc.
public final class TestGroveMapLB {
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

        long[] f = new long[300];
        byte[] r = new byte[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (long) (rand.nextDouble() * 9999);
            r[i] = (byte) ((byte) (rand.nextDouble() * 9999)+127);
        }
        TLongByteMap list = new TLongByteHashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }

        String s = gson.toJson(list, TLongByteMap.class);
        System.out.println(s);
        TLongByteMap after = gson.fromJson(s, TLongByteMap.class);

        Assert.assertEquals(list.size(), after.size());

        list.forEachEntry((a, b) -> {
            AssertUtil.equals(after.get(a), b);
            return true;
        });
    }
}
