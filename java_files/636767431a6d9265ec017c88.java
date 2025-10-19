import java.util.*;

public class Generated_636767431a6d9265ec017c88 {
    private List<Integer> computeLowerBounds(List<K> keys){
        List<Integer> lb = new ArrayList<>(keys.size());
        for(K k: keys) {
            if(k instanceof IntegerKey)
                lb.add(((IntegerKey)k).get());
            else if(k instanceof ShortKey)
                lb.add(((ShortKey)k).get());
            else if(k instanceof ByteKey)
                lb.add(((ByteKey)k).get());
            else if(k instanceof LongKey)
                lb.add(((LongKey)k).get());
            else if(k instanceof FloatKey)
                lb.add(((FloatKey)k).get());
            else if(k instanceof DoubleKey)
                lb.add(((DoubleKey)k).get());
            else
                throw new IllegalArgumentException("Unsupported key type.");
        }
        return lb;
    }
}