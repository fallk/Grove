package fallk.grove;

import com.google.gson.GsonBuilder;

import gnu.trove.list.TByteList;
import gnu.trove.list.TCharList;
import gnu.trove.list.TDoubleList;
import gnu.trove.list.TFloatList;
import gnu.trove.list.TIntList;
import gnu.trove.list.TLongList;
import gnu.trove.list.TShortList;
import gnu.trove.list.array.TByteArrayList;
import gnu.trove.list.array.TCharArrayList;
import gnu.trove.list.array.TDoubleArrayList;
import gnu.trove.list.array.TFloatArrayList;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.list.array.TShortArrayList;

/**
 * The main Grove class.
 * 
 * @author Rafael
 */
public final class Grove {
    /**
     * Add Grove to your {@link GsonBuilder} object
     * @param gs the {@link GsonBuilder} object
     * @return the same {@link GsonBuilder}, for chaining
     */
    public static GsonBuilder apply(GsonBuilder gs) {
        return //
        gs.registerTypeAdapter(TByteArrayList.class, Adapters.byteAdapter) //
        .registerTypeAdapter(TCharArrayList.class, Adapters.charAdapter) //
        .registerTypeAdapter(TDoubleArrayList.class, Adapters.doubleAdapter) //
        .registerTypeAdapter(TFloatArrayList.class, Adapters.floatAdapter) //
        .registerTypeAdapter(TIntArrayList.class, Adapters.intAdapter) //
        .registerTypeAdapter(TLongArrayList.class, Adapters.longAdapter) //
        .registerTypeAdapter(TShortArrayList.class, Adapters.shortAdapter) //
        .registerTypeAdapter(TByteList.class, new TroveByteListGenericTypeAdapter()) //
        .registerTypeAdapter(TCharList.class, new TroveCharListGenericTypeAdapter()) //
        .registerTypeAdapter(TDoubleList.class, new TroveDoubleListGenericTypeAdapter()) //
        .registerTypeAdapter(TFloatList.class, new TroveFloatListGenericTypeAdapter()) //
        .registerTypeAdapter(TIntList.class, new TroveIntListGenericTypeAdapter()) //
        .registerTypeAdapter(TLongList.class, new TroveLongListGenericTypeAdapter()) //
        .registerTypeAdapter(TShortList.class, new TroveShortListGenericTypeAdapter());
    }
}
