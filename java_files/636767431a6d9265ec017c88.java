import java.util.*;

public class Generated_636767431a6d9265ec017c88 {
    private List<Integer> computeLowerBounds(List<K> keys){
        if(keys == null || keys.isEmpty()){
            throw new IllegalArgumentException("keys cannot be empty");
        }
        
        //the result list
        List<Integer> res = new ArrayList<>();
        
        //compute the lower bounds
        for(K k : keys){
            Integer lb = getLowerBound(k);
            
            if(lb != null){
                res.add(lb);
            } else {
                throw new IllegalStateException("Cannot find the lower bound of " + k);
            }
        }
        
        return res;
    }
}