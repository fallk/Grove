// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import gnu.trove.list.TCharList;
import gnu.trove.list.array.TCharArrayList;

// Tokens:
// char = byte, char, etc.
// C = B, C, etc.
// Char = Byte, Char, etc.
// Character = Byte, Character, etc.
// Character = Byte, Character, etc. but Int instead of Integer
public class TestGroveArrayListC {

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

        char[] f = new char[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (char) (rand.nextDouble() * 99999);
        }
        TCharArrayList list = new TCharArrayList();
        
        String s = gson.toJson(list);
        
        TCharArrayList after = gson.fromJson(s, TCharArrayList.class);
        
        Assert.assertEquals(list, after);
    }
}
