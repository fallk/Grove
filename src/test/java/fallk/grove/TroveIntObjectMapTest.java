// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package fallk.grove;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntObjectHashMap;

//int
public class TroveIntObjectMapTest {
    private static class Filler {
        private static class BFiller {
            int i = 154;
            long l = -2L<<1L;
            int b = 1;
            boolean flaggy = true;
            @Override
            public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = prime * result + b;
                result = prime * result + (flaggy ? 1231 : 1237);
                result = prime * result + i;
                result = prime * result + (int) (l ^ (l >>> 32));
                return result;
            }
            @Override
            public boolean equals(Object obj) {
                if (this == obj)
                    return true;
                if (obj == null)
                    return false;
                if (getClass() != obj.getClass())
                    return false;
                BFiller other = (BFiller) obj;
                if (b != other.b)
                    return false;
                if (flaggy != other.flaggy)
                    return false;
                if (i != other.i)
                    return false;
                if (l != other.l)
                    return false;
                return true;
            }
            @Override
            public String toString() {
                return "BFiller [i=" + i + ", l=" + l + ", b=" + b + ", flaggy=" + flaggy + "]";
            }
        }
        
        int i = 15;
        long l = -1L<<1L;
        int b = 127;
        boolean bool = false;
        BFiller bf = new BFiller();
        
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + b;
            result = prime * result + ((bf == null) ? 0 : bf.hashCode());
            result = prime * result + (bool ? 1231 : 1237);
            result = prime * result + i;
            result = prime * result + (int) (l ^ (l >>> 32));
            return result;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Filler other = (Filler) obj;
            if (b != other.b)
                return false;
            if (bf == null) {
                if (other.bf != null)
                    return false;
            } else if (!bf.equals(other.bf))
                return false;
            if (bool != other.bool)
                return false;
            if (i != other.i)
                return false;
            if (l != other.l)
                return false;
            return true;
        }
        @Override
        public String toString() {
            return "Filler [i=" + i + ", l=" + l + ", b=" + b + ", bool=" + bool + ", bf=" + bf + "]";
        }
    }

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
        Gson gson = new GsonBuilder().registerTypeAdapter(new TypeToken<TIntObjectMap>(){}.getType(), new TroveIntObjectMapTypeAdapter<>()).create();
        
        int[] f = new int[300];
        for (int i = 0; i < f.length; i++) {
            f[i] = (int) (rand.nextDouble() * 127);
        }
        TIntObjectMap<Filler> list = new TIntObjectHashMap<>();
        for (int i = 0; i < f.length; i++) {
            list.put(f[i], new Filler());
        }
        
        String s = gson.toJson(list, new TypeToken<TIntObjectMap<Filler>>(){}.getType());
        System.out.println(s);
        TIntObjectMap<Filler> after = gson.fromJson(s, new TypeToken<TIntObjectMap<Filler>>(){}.getType());

        IntAsserter.arrayEquals(list.keys(), after.keys());
        IntAsserter.arrayEquals(list.values(), after.values());
    }
}
