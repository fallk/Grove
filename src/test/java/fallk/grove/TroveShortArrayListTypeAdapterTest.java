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
import gnu.trove.list.array.TShortArrayList;

//short
public class TroveShortArrayListTypeAdapterTest {

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
        Gson gson = new GsonBuilder().registerTypeAdapter(TShortList.class, new TroveShortListGenericTypeAdapter()).create();
        
        short[] f = new short[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (short) (rand.nextDouble() * 99999);
        }
        TShortArrayList list = new TShortArrayList();
        
        String s = gson.toJson(list);
        
        TShortArrayList after = gson.fromJson(s, TShortArrayList.class);
        
        Assert.assertEquals(list, after);
    }
}
