// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import gnu.trove.list.TShortList;
import gnu.trove.list.linked.TShortLinkedList;

// Tokens:
// short = byte, char, etc.
// S = B, C, etc.
// Short = Byte, Char, etc.
// Short = Byte, Character, etc.
// Short = Byte, Character, etc. but Int instead of Integer
public class TestGroveListS {

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

        short[] f = new short[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (short) (rand.nextDouble() * 99999);
        }
        TShortList list = new TShortLinkedList();
        
        String s = gson.toJson(list, TShortList.class);
        
        TShortList after = gson.fromJson(s, TShortList.class);

        Assert.assertEquals(list.size(), after.size());

        for (int i = 0, len = list.size(); i < len; i++) {
            if (list.get(i) != after.get(i)) throw new AssertionError("At list index " + i + ": Expected " + list.get(i) + " but found " + after.get(i));
        }
    }
}
