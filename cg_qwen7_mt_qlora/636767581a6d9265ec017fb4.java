import java.util.*;

public class Generated_636767581a6d9265ec017fb4 {
    /**The type of key has several upper bounds conducted by different function,this function will return a list of the minimum upper bound of each key in the given list.*/
    private List<Integer> computeUpperBounds(List<K> keys){
        int size = keys.size();
        List<Integer> result = new ArrayList<>(size);
        for(int i=0;i<size;i++){
            Integer min = null;
            for(Entry<K, Integer> entry : upperBoundMap.entrySet()){
                if(entry.getKey().isAssignableFrom(keys.get(i))){
                    if(min==null||entry.getValue()<min) {
                        min = entry.getValue();
                    }
                }
            }
            result.add(min);
        }
        return result;
    }
}