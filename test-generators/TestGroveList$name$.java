// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import gnu.trove.list.T$shrt$List;
import gnu.trove.list.linked.T$shrt$LinkedList;

// Tokens:
// $prim$ = byte, char, etc.
// $name$ = B, C, etc.
// $shrt$ = Byte, Char, etc.
// $long$ = Byte, Character, etc.
// $longGson$ = Byte, Character, etc. but Int instead of Integer
public class TestGroveList$name$ {

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

        $prim$[] f = new $prim$[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = ($prim$) (rand.nextDouble() * 99999);
        }
        T$shrt$List list = new T$shrt$LinkedList();
        
        String s = gson.toJson(list, T$shrt$List.class);
        
        T$shrt$List after = gson.fromJson(s, T$shrt$List.class);

        Assert.assertEquals(list.size(), after.size());

        for (int i = 0, len = list.size(); i < len; i++) {
            if (list.get(i) != after.get(i)) throw new AssertionError("At list index " + i + ": Expected " + list.get(i) + " but found " + after.get(i));
        }
    }
}
