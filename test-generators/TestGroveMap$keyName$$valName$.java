// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import gnu.trove.map.T$keyShrt$$valShrt$Map;
import gnu.trove.map.T$keyShrt$ObjectMap;
import gnu.trove.map.hash.T$keyShrt$$valShrt$HashMap;
import gnu.trove.map.hash.T$keyShrt$ObjectHashMap;

// Tokens:
// $keyPrim$, $valPrim$ = byte, char, etc.
// $keyName$, $valName$ = B, C, etc.
// $keyShrt$, $valShrt$ = Byte, Char, etc.
// $keyLong$, $valLong$ = Byte, Character, etc.
// $kvShort$ = ByteByte, ByteChar, etc.
public final class TestGroveMap$keyName$$valName$ {
    private Random rand;

    @Before
    public void setUp() throws Exception {
        rand = new Random(4); // chosen by fair dice roll. guaranteed to be random.
    }

    @After
    public void tearDown() throws Exception {
    }

    @SuppressWarnings("all")
    @Test
    public void test() {
        Gson gson = new GroveBuilder().create();

        $keyPrim$[] f = new $keyPrim$[300];
        $valPrim$[] r = new $valPrim$[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = ($keyPrim$) (rand.nextDouble() * 9999);
            r[i] = ($valPrim$) (($valPrim$) (rand.nextDouble() * 9999)+127);
        }
        T$keyShrt$$valShrt$Map list = new T$keyShrt$$valShrt$HashMap();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], r[i]);
        }

        String s = gson.toJson(list, T$keyShrt$$valShrt$Map.class);
        System.out.println(s);
        T$keyShrt$$valShrt$Map after = gson.fromJson(s, T$keyShrt$$valShrt$Map.class);

        Assert.assertEquals(list.size(), after.size());

        list.forEachEntry((a, b) -> {
            AssertUtil.equals(after.get(a), b);
            return true;
        });
    }
}
