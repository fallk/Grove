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
import gnu.trove.list.array.TIntArrayList;

// Tokens:
// int = byte, char, etc.
// I = B, C, etc.
// Int = Byte, Char, etc.
// Integer = Byte, Character, etc.
// Int = Byte, Character, etc. but Int instead of Integer
public class TestGroveArrayListI {

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
        TIntArrayList list = new TIntArrayList();
        
        String s = gson.toJson(list);
        
        TIntArrayList after = gson.fromJson(s, TIntArrayList.class);
        
        Assert.assertEquals(list, after);
    }
}
