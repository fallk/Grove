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
import gnu.trove.list.array.TFloatArrayList;

// Tokens:
// float = byte, char, etc.
// F = B, C, etc.
// Float = Byte, Char, etc.
// Float = Byte, Character, etc.
// Float = Byte, Character, etc. but Int instead of Integer
public class TestGroveArrayListF {

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
        TFloatArrayList list = new TFloatArrayList();
        
        String s = gson.toJson(list);
        
        TFloatArrayList after = gson.fromJson(s, TFloatArrayList.class);
        
        Assert.assertEquals(list, after);
    }
}
