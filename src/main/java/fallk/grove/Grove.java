package fallk.grove;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
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

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * The main Grove class.
 * 
 * @author Maxine
 */
public final class Grove {
    private Grove() {}

    /**
     * Add Grove to your {@link GsonBuilder} object
     * 
     * @param gs the {@link GsonBuilder} object
     * @return the same {@link GsonBuilder}, for chaining
     */
    public static GsonBuilder apply(GsonBuilder gs) {
        // Generating: First copy names of all the classes without paths.
        // Replace Grove(ArrayList|List)(\w+)
        // With    .registerTypeAdapter\(T$2$1.class, Grove$1$2.INSTANCE\) //
        // Replace GroveMap(Byte|Char|Double|Float|Int|Long|Object|Short)(Byte|Char|Double|Float|Int|Long|Object|Short)
        // With    .registerTypeAdapter\(T$1$2Map.class, GroveMap$1$2.INSTANCE\) //

        return gs //
                .registerTypeAdapter(TByteArrayList.class, GroveArrayListByte.INSTANCE) //
                .registerTypeAdapter(TCharArrayList.class, GroveArrayListChar.INSTANCE) //
                .registerTypeAdapter(TDoubleArrayList.class, GroveArrayListDouble.INSTANCE) //
                .registerTypeAdapter(TFloatArrayList.class, GroveArrayListFloat.INSTANCE) //
                .registerTypeAdapter(TIntArrayList.class, GroveArrayListInt.INSTANCE) //
                .registerTypeAdapter(TLongArrayList.class, GroveArrayListLong.INSTANCE) //
                .registerTypeAdapter(TShortArrayList.class, GroveArrayListShort.INSTANCE) //
                .registerTypeAdapter(TByteList.class, GroveListByte.INSTANCE) //
                .registerTypeAdapter(TCharList.class, GroveListChar.INSTANCE) //
                .registerTypeAdapter(TDoubleList.class, GroveListDouble.INSTANCE) //
                .registerTypeAdapter(TFloatList.class, GroveListFloat.INSTANCE) //
                .registerTypeAdapter(TIntList.class, GroveListInt.INSTANCE) //
                .registerTypeAdapter(TLongList.class, GroveListLong.INSTANCE) //
                .registerTypeAdapter(TShortList.class, GroveListShort.INSTANCE) //
                .registerTypeAdapter(TByteByteMap.class, GroveMapByteByte.INSTANCE) //
                .registerTypeAdapter(TByteCharMap.class, GroveMapByteChar.INSTANCE) //
                .registerTypeAdapter(TByteDoubleMap.class, GroveMapByteDouble.INSTANCE) //
                .registerTypeAdapter(TByteFloatMap.class, GroveMapByteFloat.INSTANCE) //
                .registerTypeAdapter(TByteIntMap.class, GroveMapByteInt.INSTANCE) //
                .registerTypeAdapter(TByteLongMap.class, GroveMapByteLong.INSTANCE) //
                .registerTypeAdapter(TByteObjectMap.class, GroveMapByteObject.INSTANCE) //
                .registerTypeAdapter(TByteShortMap.class, GroveMapByteShort.INSTANCE) //
                .registerTypeAdapter(TCharByteMap.class, GroveMapCharByte.INSTANCE) //
                .registerTypeAdapter(TCharCharMap.class, GroveMapCharChar.INSTANCE) //
                .registerTypeAdapter(TCharDoubleMap.class, GroveMapCharDouble.INSTANCE) //
                .registerTypeAdapter(TCharFloatMap.class, GroveMapCharFloat.INSTANCE) //
                .registerTypeAdapter(TCharIntMap.class, GroveMapCharInt.INSTANCE) //
                .registerTypeAdapter(TCharLongMap.class, GroveMapCharLong.INSTANCE) //
                .registerTypeAdapter(TCharObjectMap.class, GroveMapCharObject.INSTANCE) //
                .registerTypeAdapter(TCharShortMap.class, GroveMapCharShort.INSTANCE) //
                .registerTypeAdapter(TDoubleByteMap.class, GroveMapDoubleByte.INSTANCE) //
                .registerTypeAdapter(TDoubleCharMap.class, GroveMapDoubleChar.INSTANCE) //
                .registerTypeAdapter(TDoubleDoubleMap.class, GroveMapDoubleDouble.INSTANCE) //
                .registerTypeAdapter(TDoubleFloatMap.class, GroveMapDoubleFloat.INSTANCE) //
                .registerTypeAdapter(TDoubleIntMap.class, GroveMapDoubleInt.INSTANCE) //
                .registerTypeAdapter(TDoubleLongMap.class, GroveMapDoubleLong.INSTANCE) //
                .registerTypeAdapter(TDoubleObjectMap.class, GroveMapDoubleObject.INSTANCE) //
                .registerTypeAdapter(TDoubleShortMap.class, GroveMapDoubleShort.INSTANCE) //
                .registerTypeAdapter(TFloatByteMap.class, GroveMapFloatByte.INSTANCE) //
                .registerTypeAdapter(TFloatCharMap.class, GroveMapFloatChar.INSTANCE) //
                .registerTypeAdapter(TFloatDoubleMap.class, GroveMapFloatDouble.INSTANCE) //
                .registerTypeAdapter(TFloatFloatMap.class, GroveMapFloatFloat.INSTANCE) //
                .registerTypeAdapter(TFloatIntMap.class, GroveMapFloatInt.INSTANCE) //
                .registerTypeAdapter(TFloatLongMap.class, GroveMapFloatLong.INSTANCE) //
                .registerTypeAdapter(TFloatObjectMap.class, GroveMapFloatObject.INSTANCE) //
                .registerTypeAdapter(TFloatShortMap.class, GroveMapFloatShort.INSTANCE) //
                .registerTypeAdapter(TIntByteMap.class, GroveMapIntByte.INSTANCE) //
                .registerTypeAdapter(TIntCharMap.class, GroveMapIntChar.INSTANCE) //
                .registerTypeAdapter(TIntDoubleMap.class, GroveMapIntDouble.INSTANCE) //
                .registerTypeAdapter(TIntFloatMap.class, GroveMapIntFloat.INSTANCE) //
                .registerTypeAdapter(TIntIntMap.class, GroveMapIntInt.INSTANCE) //
                .registerTypeAdapter(TIntLongMap.class, GroveMapIntLong.INSTANCE) //
                .registerTypeAdapter(TIntObjectMap.class, GroveMapIntObject.INSTANCE) //
                .registerTypeAdapter(TIntShortMap.class, GroveMapIntShort.INSTANCE) //
                .registerTypeAdapter(TLongByteMap.class, GroveMapLongByte.INSTANCE) //
                .registerTypeAdapter(TLongCharMap.class, GroveMapLongChar.INSTANCE) //
                .registerTypeAdapter(TLongDoubleMap.class, GroveMapLongDouble.INSTANCE) //
                .registerTypeAdapter(TLongFloatMap.class, GroveMapLongFloat.INSTANCE) //
                .registerTypeAdapter(TLongIntMap.class, GroveMapLongInt.INSTANCE) //
                .registerTypeAdapter(TLongLongMap.class, GroveMapLongLong.INSTANCE) //
                .registerTypeAdapter(TLongObjectMap.class, GroveMapLongObject.INSTANCE) //
                .registerTypeAdapter(TLongShortMap.class, GroveMapLongShort.INSTANCE) //
                .registerTypeAdapter(TShortByteMap.class, GroveMapShortByte.INSTANCE) //
                .registerTypeAdapter(TShortCharMap.class, GroveMapShortChar.INSTANCE) //
                .registerTypeAdapter(TShortDoubleMap.class, GroveMapShortDouble.INSTANCE) //
                .registerTypeAdapter(TShortFloatMap.class, GroveMapShortFloat.INSTANCE) //
                .registerTypeAdapter(TShortIntMap.class, GroveMapShortInt.INSTANCE) //
                .registerTypeAdapter(TShortLongMap.class, GroveMapShortLong.INSTANCE) //
                .registerTypeAdapter(TShortObjectMap.class, GroveMapShortObject.INSTANCE) //
                .registerTypeAdapter(TShortShortMap.class, GroveMapShortShort.INSTANCE) //
        ;
    }

    // For a T{type}ObjectMap<A> or TObject{type}Map<A>, gets the type of <A>.
    static Type getGenericType(Type typeOfT) {
        if (!(typeOfT instanceof ParameterizedType)) {
            throw new JsonParseException("Invalid Object-Primitive map type: " + typeOfT);
        }

        ParameterizedType castTypeOfT = (ParameterizedType) typeOfT;

        return castTypeOfT.getActualTypeArguments()[0];
    }

    static char parseChar(String string) {
        return string.charAt(0);
    }
}
