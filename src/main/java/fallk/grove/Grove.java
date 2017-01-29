package fallk.grove;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

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
import gnu.trove.map.TByteByteMap;
import gnu.trove.map.TByteCharMap;
import gnu.trove.map.TByteDoubleMap;
import gnu.trove.map.TByteFloatMap;
import gnu.trove.map.TByteIntMap;
import gnu.trove.map.TByteLongMap;
import gnu.trove.map.TByteObjectMap;
import gnu.trove.map.TByteShortMap;
import gnu.trove.map.TCharByteMap;
import gnu.trove.map.TCharCharMap;
import gnu.trove.map.TCharDoubleMap;
import gnu.trove.map.TCharFloatMap;
import gnu.trove.map.TCharIntMap;
import gnu.trove.map.TCharLongMap;
import gnu.trove.map.TCharObjectMap;
import gnu.trove.map.TCharShortMap;
import gnu.trove.map.TDoubleByteMap;
import gnu.trove.map.TDoubleCharMap;
import gnu.trove.map.TDoubleDoubleMap;
import gnu.trove.map.TDoubleFloatMap;
import gnu.trove.map.TDoubleIntMap;
import gnu.trove.map.TDoubleLongMap;
import gnu.trove.map.TDoubleObjectMap;
import gnu.trove.map.TDoubleShortMap;
import gnu.trove.map.TFloatByteMap;
import gnu.trove.map.TFloatCharMap;
import gnu.trove.map.TFloatDoubleMap;
import gnu.trove.map.TFloatFloatMap;
import gnu.trove.map.TFloatIntMap;
import gnu.trove.map.TFloatLongMap;
import gnu.trove.map.TFloatObjectMap;
import gnu.trove.map.TFloatShortMap;
import gnu.trove.map.TIntByteMap;
import gnu.trove.map.TIntCharMap;
import gnu.trove.map.TIntDoubleMap;
import gnu.trove.map.TIntFloatMap;
import gnu.trove.map.TIntIntMap;
import gnu.trove.map.TIntLongMap;
import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.TIntShortMap;
import gnu.trove.map.TLongByteMap;
import gnu.trove.map.TLongCharMap;
import gnu.trove.map.TLongDoubleMap;
import gnu.trove.map.TLongFloatMap;
import gnu.trove.map.TLongIntMap;
import gnu.trove.map.TLongLongMap;
import gnu.trove.map.TLongObjectMap;
import gnu.trove.map.TLongShortMap;
import gnu.trove.map.TShortByteMap;
import gnu.trove.map.TShortCharMap;
import gnu.trove.map.TShortDoubleMap;
import gnu.trove.map.TShortFloatMap;
import gnu.trove.map.TShortIntMap;
import gnu.trove.map.TShortLongMap;
import gnu.trove.map.TShortObjectMap;
import gnu.trove.map.TShortShortMap;

/**
 * The main Grove class.
 * 
 * @author Rafael
 */
public final class Grove {
    /**
     * Add Grove to your {@link GsonBuilder} object
     * 
     * @param gs the {@link GsonBuilder} object
     * @return the same {@link GsonBuilder}, for chaining
     */
    @SuppressWarnings("rawtypes")
    public static GsonBuilder apply(GsonBuilder gs) {
        return //
        gs.registerTypeAdapter(TByteArrayList.class, Adapters.byteAdapter) //
                .registerTypeAdapter(TCharArrayList.class, Adapters.charAdapter) //
                .registerTypeAdapter(TDoubleArrayList.class, Adapters.doubleAdapter) //
                .registerTypeAdapter(TFloatArrayList.class, Adapters.floatAdapter) //
                .registerTypeAdapter(TIntArrayList.class, Adapters.intAdapter) //
                .registerTypeAdapter(TLongArrayList.class, Adapters.longAdapter) //
                .registerTypeAdapter(TShortArrayList.class, Adapters.shortAdapter) //
                //
                .registerTypeAdapter(TByteList.class, new TroveByteListGenericTypeAdapter()) //
                .registerTypeAdapter(TCharList.class, new TroveCharListGenericTypeAdapter()) //
                .registerTypeAdapter(TDoubleList.class, new TroveDoubleListGenericTypeAdapter()) //
                .registerTypeAdapter(TFloatList.class, new TroveFloatListGenericTypeAdapter()) //
                .registerTypeAdapter(TIntList.class, new TroveIntListGenericTypeAdapter()) //
                .registerTypeAdapter(TLongList.class, new TroveLongListGenericTypeAdapter()) //
                .registerTypeAdapter(TShortList.class, new TroveShortListGenericTypeAdapter()) //
                //
                .registerTypeAdapter(new TypeToken<TByteObjectMap>() {
                }.getType(), new TroveByteObjectMapTypeAdapter<>()) //
                .registerTypeAdapter(new TypeToken<TCharObjectMap>() {
                }.getType(), new TroveCharObjectMapTypeAdapter<>()) //
                .registerTypeAdapter(new TypeToken<TDoubleObjectMap>() {
                }.getType(), new TroveDoubleObjectMapTypeAdapter<>()) //
                .registerTypeAdapter(new TypeToken<TFloatObjectMap>() {
                }.getType(), new TroveFloatObjectMapTypeAdapter<>()) //
                .registerTypeAdapter(new TypeToken<TIntObjectMap>() {
                }.getType(), new TroveIntObjectMapTypeAdapter<>()) //
                .registerTypeAdapter(new TypeToken<TLongObjectMap>() {
                }.getType(), new TroveLongObjectMapTypeAdapter<>()) //
                .registerTypeAdapter(new TypeToken<TShortObjectMap>() {
                }.getType(), new TroveShortObjectMapTypeAdapter<>()) //
                //
                .registerTypeAdapter(TByteByteMap.class, new MTroveByteByteMapTypeAdapter()) //
                .registerTypeAdapter(TByteCharMap.class, new MTroveByteCharMapTypeAdapter()) //
                .registerTypeAdapter(TByteDoubleMap.class, new MTroveByteDoubleMapTypeAdapter()) //
                .registerTypeAdapter(TByteFloatMap.class, new MTroveByteFloatMapTypeAdapter()) //
                .registerTypeAdapter(TByteIntMap.class, new MTroveByteIntMapTypeAdapter()) //
                .registerTypeAdapter(TByteLongMap.class, new MTroveByteLongMapTypeAdapter()) //
                .registerTypeAdapter(TByteShortMap.class, new MTroveByteShortMapTypeAdapter()) //
                .registerTypeAdapter(TCharByteMap.class, new MTroveCharByteMapTypeAdapter()) //
                .registerTypeAdapter(TCharCharMap.class, new MTroveCharCharMapTypeAdapter()) //
                .registerTypeAdapter(TCharDoubleMap.class, new MTroveCharDoubleMapTypeAdapter()) //
                .registerTypeAdapter(TCharFloatMap.class, new MTroveCharFloatMapTypeAdapter()) //
                .registerTypeAdapter(TCharIntMap.class, new MTroveCharIntMapTypeAdapter()) //
                .registerTypeAdapter(TCharLongMap.class, new MTroveCharLongMapTypeAdapter()) //
                .registerTypeAdapter(TCharShortMap.class, new MTroveCharShortMapTypeAdapter()) //
                .registerTypeAdapter(TDoubleByteMap.class, new MTroveDoubleByteMapTypeAdapter()) //
                .registerTypeAdapter(TDoubleCharMap.class, new MTroveDoubleCharMapTypeAdapter()) //
                .registerTypeAdapter(TDoubleDoubleMap.class, new MTroveDoubleDoubleMapTypeAdapter()) //
                .registerTypeAdapter(TDoubleFloatMap.class, new MTroveDoubleFloatMapTypeAdapter()) //
                .registerTypeAdapter(TDoubleIntMap.class, new MTroveDoubleIntMapTypeAdapter()) //
                .registerTypeAdapter(TDoubleLongMap.class, new MTroveDoubleLongMapTypeAdapter()) //
                .registerTypeAdapter(TDoubleShortMap.class, new MTroveDoubleShortMapTypeAdapter()) //
                .registerTypeAdapter(TFloatByteMap.class, new MTroveFloatByteMapTypeAdapter()) //
                .registerTypeAdapter(TFloatCharMap.class, new MTroveFloatCharMapTypeAdapter()) //
                .registerTypeAdapter(TFloatDoubleMap.class, new MTroveFloatDoubleMapTypeAdapter()) //
                .registerTypeAdapter(TFloatFloatMap.class, new MTroveFloatFloatMapTypeAdapter()) //
                .registerTypeAdapter(TFloatIntMap.class, new MTroveFloatIntMapTypeAdapter()) //
                .registerTypeAdapter(TFloatLongMap.class, new MTroveFloatLongMapTypeAdapter()) //
                .registerTypeAdapter(TFloatShortMap.class, new MTroveFloatShortMapTypeAdapter()) //
                .registerTypeAdapter(TIntByteMap.class, new MTroveIntByteMapTypeAdapter()) //
                .registerTypeAdapter(TIntCharMap.class, new MTroveIntCharMapTypeAdapter()) //
                .registerTypeAdapter(TIntDoubleMap.class, new MTroveIntDoubleMapTypeAdapter()) //
                .registerTypeAdapter(TIntFloatMap.class, new MTroveIntFloatMapTypeAdapter()) //
                .registerTypeAdapter(TIntIntMap.class, new MTroveIntIntMapTypeAdapter()) //
                .registerTypeAdapter(TIntLongMap.class, new MTroveIntLongMapTypeAdapter()) //
                .registerTypeAdapter(TIntShortMap.class, new MTroveIntShortMapTypeAdapter()) //
                .registerTypeAdapter(TLongByteMap.class, new MTroveLongByteMapTypeAdapter()) //
                .registerTypeAdapter(TLongCharMap.class, new MTroveLongCharMapTypeAdapter()) //
                .registerTypeAdapter(TLongDoubleMap.class, new MTroveLongDoubleMapTypeAdapter()) //
                .registerTypeAdapter(TLongFloatMap.class, new MTroveLongFloatMapTypeAdapter()) //
                .registerTypeAdapter(TLongIntMap.class, new MTroveLongIntMapTypeAdapter()) //
                .registerTypeAdapter(TLongLongMap.class, new MTroveLongLongMapTypeAdapter()) //
                .registerTypeAdapter(TLongShortMap.class, new MTroveLongShortMapTypeAdapter()) //
                .registerTypeAdapter(TShortByteMap.class, new MTroveShortByteMapTypeAdapter()) //
                .registerTypeAdapter(TShortCharMap.class, new MTroveShortCharMapTypeAdapter()) //
                .registerTypeAdapter(TShortDoubleMap.class, new MTroveShortDoubleMapTypeAdapter()) //
                .registerTypeAdapter(TShortFloatMap.class, new MTroveShortFloatMapTypeAdapter()) //
                .registerTypeAdapter(TShortIntMap.class, new MTroveShortIntMapTypeAdapter()) //
                .registerTypeAdapter(TShortLongMap.class, new MTroveShortLongMapTypeAdapter()) //
                .registerTypeAdapter(TShortShortMap.class, new MTroveShortShortMapTypeAdapter()) //
        //
        //        .registerTypeAdapter(TByteObjectMap.class, new TroveByteObjectMapTypeAdapter<>()) //new TypeToken<TByteObjectMap>(){}.getType(), new TroveByteObjectMapTypeAdapter<>()
        //        .registerTypeAdapter(TCharObjectMap.class, new TroveCharObjectMapTypeAdapter<>()) //
        //        .registerTypeAdapter(TDoubleObjectMap.class, new TroveDoubleObjectMapTypeAdapter<>()) //
        //        .registerTypeAdapter(TFloatObjectMap.class, new TroveFloatObjectMapTypeAdapter<>()) //
        //        .registerTypeAdapter(TIntObjectMap.class, new TroveIntObjectMapTypeAdapter<>()) //
        //        .registerTypeAdapter(TLongObjectMap.class, new TroveLongObjectMapTypeAdapter<>()) //
        //        .registerTypeAdapter(TShortObjectMap.class, new TroveShortObjectMapTypeAdapter<>())
        ;
    }
}
