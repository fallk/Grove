// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import gnu.trove.list.TByteList;
import gnu.trove.list.array.TByteArrayList;

// Tokens:
// byte = byte, char, etc.
// B = B, C, etc.
// Byte = Byte, Char, etc.
// Byte = Byte, Character, etc.
// Byte = Byte, Character, etc. but Int instead of Integer
public class TestGroveArrayListB {

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

        byte[] f = new byte[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (byte) (rand.nextDouble() * 99999);
        }
        TByteArrayList list = new TByteArrayList();
        
        String s = gson.toJson(list);
        
        TByteArrayList after = gson.fromJson(s, TByteArrayList.class);
        
        Assert.assertEquals(list, after);
    }
}
