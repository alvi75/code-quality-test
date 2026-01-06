import java.util.*;

public class Generated_636767581a6d9265ec017fb4 {
    /**
 * The type of key has several upper bounds conducted by different function,this function will return a list of the minimum upper bound of each key in the given list.
 */
    private List<Integer> computeUpperBounds(List<K> keys){
        List<Integer> result = new ArrayList<>();
        for (K k : keys) {
            int min = Integer.MAX_VALUE;
            if(k instanceof IntKey)
                min = ((IntKey)k).getMin();
            else if(k instanceof LongKey)
                min = ((LongKey)k).getMin();
            else if(k instanceof DoubleKey)
                min = ((DoubleKey)k).getMin();
            else if(k instanceof FloatKey)
                min = ((FloatKey)k).getMin();
            else if(k instanceof ShortKey)
                min = ((ShortKey)k).getMin();
            else if(k instanceof ByteKey)
                min = ((ByteKey)k).getMin();
            else if(k instanceof CharKey)
                min = ((CharKey)k).getMin();
            else if(k instanceof StringKey)
                min = ((StringKey)k).getMin();
            else if(k instanceof BooleanKey)
                min = ((BooleanKey)k).getMin();
            else if(k instanceof DateKey)
                min = ((DateKey)k).getMin();
            else if(k instanceof TimeKey)
                min = ((TimeKey)k).getMin();
            else if(k instanceof TimestampKey)
                min = ((TimestampKey)k).getMin();
            else if(k instanceof UUIDKey)
                min = ((UUIDKey)k).getMin();
            else if(k instanceof BigDecimalKey)
                min = ((BigDecimalKey)k).getMin();
            else if(k instanceof BigIntegerKey)
                min = ((BigIntegerKey)k).getMin();
            else if(k instanceof NumberKey)
                min = ((NumberKey)k).getMin();
            else if(k instanceof ObjectKey)
                min = ((ObjectKey)k).getMin();
            else if(k instanceof EnumKey)
                min = ((EnumKey)k).getMin();
            else if(k instanceof Key)
                min = ((Key)k).getMin();

            result.add(min);
        }
        return result;
    }
}