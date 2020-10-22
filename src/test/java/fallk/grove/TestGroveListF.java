// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import gnu.trove.list.TFloatList;
import gnu.trove.list.linked.TFloatLinkedList;

// Tokens:
// float = byte, char, etc.
// F = B, C, etc.
// Float = Byte, Char, etc.
// Float = Byte, Character, etc.
// Float = Byte, Character, etc. but Int instead of Integer
public class TestGroveListF {

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

        float[] f = new float[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (float) (rand.nextDouble() * 99999);
        }
        TFloatList list = new TFloatLinkedList();
        
        String s = gson.toJson(list, TFloatList.class);
        
        TFloatList after = gson.fromJson(s, TFloatList.class);

        Assert.assertEquals(list.size(), after.size());

        for (int i = 0, len = list.size(); i < len; i++) {
            if (list.get(i) != after.get(i)) throw new AssertionError("At list index " + i + ": Expected " + list.get(i) + " but found " + after.get(i));
        }
    }
}
