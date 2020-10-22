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
import gnu.trove.list.array.T$shrt$ArrayList;

// Tokens:
// $prim$ = byte, char, etc.
// $name$ = B, C, etc.
// $shrt$ = Byte, Char, etc.
// $long$ = Byte, Character, etc.
// $longGson$ = Byte, Character, etc. but Int instead of Integer
public class TestGroveArrayList$name$ {

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
        T$shrt$ArrayList list = new T$shrt$ArrayList();
        
        String s = gson.toJson(list);
        
        T$shrt$ArrayList after = gson.fromJson(s, T$shrt$ArrayList.class);
        
        Assert.assertEquals(list, after);
    }
}
