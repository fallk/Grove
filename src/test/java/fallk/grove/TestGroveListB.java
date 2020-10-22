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
import gnu.trove.list.linked.TByteLinkedList;

// Tokens:
// byte = byte, char, etc.
// B = B, C, etc.
// Byte = Byte, Char, etc.
// Byte = Byte, Character, etc.
// Byte = Byte, Character, etc. but Int instead of Integer
public class TestGroveListB {

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
        TByteList list = new TByteLinkedList();
        
        String s = gson.toJson(list, TByteList.class);
        
        TByteList after = gson.fromJson(s, TByteList.class);

        Assert.assertEquals(list.size(), after.size());

        for (int i = 0, len = list.size(); i < len; i++) {
            if (list.get(i) != after.get(i)) throw new AssertionError("At list index " + i + ": Expected " + list.get(i) + " but found " + after.get(i));
        }
    }
}
