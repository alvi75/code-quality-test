import java.util.*;

public class Generated_636767431a6d9265ec017c88 {
    /**The type of key has several lower bounds conducted by different function,this function will return a list of the maximum lower bound of each key in the given list.*/
    private List<Integer> computeLowerBounds(List<K> keys){
        List<Integer> lowerBounds = new ArrayList<>();
        for(K key : keys){
            int lowerBound = Integer.MAX_VALUE;
            for(int i=0;i<lowerBoundFunctions.size();i++){
                if(lowerBoundFunctions.get(i).isConductedBy(key)){
                    lowerBound = Math.min(lowerBound,lowerBoundFunctions.get(i).getLowerBound());
                }
            }
            lowerBounds.add(lowerBound);
        }
        return lowerBounds;
    }
}