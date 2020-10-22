// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import gnu.trove.list.TIntList;
import gnu.trove.list.linked.TIntLinkedList;

// Tokens:
// int = byte, char, etc.
// I = B, C, etc.
// Int = Byte, Char, etc.
// Integer = Byte, Character, etc.
// Int = Byte, Character, etc. but Int instead of Integer
public class TestGroveListI {

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

        int[] f = new int[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (int) (rand.nextDouble() * 99999);
        }
        TIntList list = new TIntLinkedList();
        
        String s = gson.toJson(list, TIntList.class);
        
        TIntList after = gson.fromJson(s, TIntList.class);

        Assert.assertEquals(list.size(), after.size());

        for (int i = 0, len = list.size(); i < len; i++) {
            if (list.get(i) != after.get(i)) throw new AssertionError("At list index " + i + ": Expected " + list.get(i) + " but found " + after.get(i));
        }
    }
}
