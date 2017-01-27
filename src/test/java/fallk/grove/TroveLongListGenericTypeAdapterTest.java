// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import gnu.trove.list.TLongList;
import gnu.trove.list.linked.TLongLinkedList;

//long
public class TroveLongListGenericTypeAdapterTest {

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
        Gson gson = new GsonBuilder().registerTypeAdapter(TLongList.class, new TroveLongListGenericTypeAdapter()).create();
        
        long[] f = new long[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (long) (rand.nextDouble() * 99999);
        }
        TLongList list = new TLongLinkedList();
        
        String s = gson.toJson(list, TLongList.class);
        
        TLongList after = gson.fromJson(s, TLongList.class);
        
        Assert.assertEquals(list, after);
    }
}
