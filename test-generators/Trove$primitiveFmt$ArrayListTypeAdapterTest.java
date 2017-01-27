// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import gnu.trove.list.T$primitiveFmt$List;
import gnu.trove.list.array.T$primitiveFmt$ArrayList;

//$primitive$
public class Trove$primitiveFmt$ArrayListTypeAdapterTest {

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
        Gson gson = new GsonBuilder().registerTypeAdapter(T$primitiveFmt$List.class, new Trove$primitiveFmt$ListGenericTypeAdapter()).create();
        
        $primitive$[] f = new $primitive$[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = ($primitive$) (rand.nextDouble() * 99999);
        }
        T$primitiveFmt$ArrayList list = new T$primitiveFmt$ArrayList();
        
        String s = gson.toJson(list);
        
        T$primitiveFmt$ArrayList after = gson.fromJson(s, T$primitiveFmt$ArrayList.class);
        
        Assert.assertEquals(list, after);
    }
}
