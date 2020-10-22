// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import gnu.trove.list.TLongList;
import gnu.trove.list.array.TLongArrayList;

// Tokens:
// long = byte, char, etc.
// L = B, C, etc.
// Long = Byte, Char, etc.
// Long = Byte, Character, etc.
// Long = Byte, Character, etc. but Int instead of Integer
public class TestGroveArrayListL {

    private Random rand;

    @Before
    public void setUp() throws Exception {
        rand = new Random();
    }

    @After
    public void tearDown() throws Exception {
    }

    @SuppressWarnings("all")
    @Test
    public void test() {
        Gson gson = new GroveBuilder().create();

        long[] f = new long[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (long) (rand.nextDouble() * 99999);
        }
        TLongArrayList list = new TLongArrayList();
        
        String s = gson.toJson(list);
        
        TLongArrayList after = gson.fromJson(s, TLongArrayList.class);
        
        Assert.assertEquals(list, after);
    }
}
