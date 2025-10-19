import java.util.*;

public class Generated_636767581a6d9265ec017fb4 {
    private List<Integer> computeUpperBounds(List<K> keys){
        List<Integer> result = new ArrayList<>();
        for(K k : keys){
            int index = 0;
            for(int i = 0; i < this.upperBound.length; i++){
                if(this.upperBound[i] <= k.compareTo(this.lowerBound[i])){
                    index = i;
                    break;
                }
            }
            result.add(index);
        }
        return result;
    }
}