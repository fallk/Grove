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

//int
public class TroveIntListGenericTypeAdapterTest {

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
        Gson gson = new GsonBuilder().registerTypeAdapter(TIntList.class, new TroveIntListGenericTypeAdapter()).create();
        
        int[] f = new int[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (int) (rand.nextDouble() * 99999);
        }
        TIntList list = new TIntLinkedList();
        
        String s = gson.toJson(list, TIntList.class);
        
        TIntList after = gson.fromJson(s, TIntList.class);
        
        Assert.assertEquals(list, after);
    }
}
