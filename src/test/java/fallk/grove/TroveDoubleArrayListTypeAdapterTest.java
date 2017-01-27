// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import gnu.trove.list.TDoubleList;
import gnu.trove.list.array.TDoubleArrayList;

//double
public class TroveDoubleArrayListTypeAdapterTest {

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
        Gson gson = new GsonBuilder().registerTypeAdapter(TDoubleList.class, new TroveDoubleListGenericTypeAdapter()).create();
        
        double[] f = new double[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (double) (rand.nextDouble() * 99999);
        }
        TDoubleArrayList list = new TDoubleArrayList();
        
        String s = gson.toJson(list);
        
        TDoubleArrayList after = gson.fromJson(s, TDoubleArrayList.class);
        
        Assert.assertEquals(list, after);
    }
}
