import java.util.*;

public class Generated_636767581a6d9265ec017fb4 {
    private List<Integer> computeUpperBounds(List<K> keys){
        if(keys == null || keys.isEmpty()){
            throw new IllegalArgumentException("keys cannot be empty");
        }
        
        //the result list
        List<Integer> res = new ArrayList<>();
        
        //compute the upper bounds for each key
        for(K k : keys){
            Integer ub = getUpperBound(k);
            
            if(ub != null){
                res.add(ub);
            } else {
                throw new IllegalStateException("Cannot find the upper bound of " + k);
            }
        }
        
        return res;
    }
}