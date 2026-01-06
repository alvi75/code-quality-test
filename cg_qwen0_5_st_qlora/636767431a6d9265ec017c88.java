import java.util.*;

public class Generated_636767431a6d9265ec017c88 {
    private List<Integer> computeLowerBounds(List<K> keys){
        List<Integer> lowerBound = new ArrayList<>();
        for(K k : keys){
            int index = 0;
            while(index < lowerBound.size() && lowerBound.get(index) <= k.compareTo(lowerBound.get(index))){
                index++;
            }
            if(index == lowerBound.size()){
                lowerBound.add(k.compareTo(lowerBound.get(index)) ? k.compareTo(lowerBound.get(index-1)) : k);
            }else{
                lowerBound.set(index, k.compareTo(lowerBound.get(index)) ? k.compareTo(lowerBound.get(index-1)) : k);
            }
        }
        return lowerBound;
    }
}