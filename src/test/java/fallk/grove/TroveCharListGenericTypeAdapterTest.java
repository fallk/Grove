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
import gnu.trove.list.linked.TCharLinkedList;

//char
public class TroveCharListGenericTypeAdapterTest {

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
        Gson gson = new GsonBuilder().registerTypeAdapter(TCharList.class, new TroveCharListGenericTypeAdapter()).create();
        
        char[] f = new char[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (char) (rand.nextDouble() * 99999);
        }
        TCharList list = new TCharLinkedList();
        
        String s = gson.toJson(list, TCharList.class);
        
        TCharList after = gson.fromJson(s, TCharList.class);
        
        Assert.assertEquals(list, after);
    }
}
