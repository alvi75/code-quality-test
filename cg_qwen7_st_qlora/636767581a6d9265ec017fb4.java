import java.util.*;

public class Generated_636767581a6d9265ec017fb4 {
    private List<Integer> computeUpperBounds(List<K> keys){
        List<Integer> upperBounds = new ArrayList<>();
        for(K k : keys){
            int min = Integer.MAX_VALUE;
            for(int i=0;i<keyTypes.size();i++){
                if(keyTypes.get(i).isAssignableFrom(k.getClass())){
                    min = Math.min(min,upperBound[i]);
                }
            }
            upperBounds.add(min);
        }
        return upperBounds;
    }
}