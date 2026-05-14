import java.util.*;

public class Generated_636767431a6d9265ec017c88 {
    /**The type of key has several lower bounds conducted by different function,this function will return a list of the maximum lower bound of each key in the given list.*/
    private List<Integer> computeLowerBounds(List<K> keys){
        List<Integer> lowerBounds = new ArrayList<>();
        for (K k : keys) {
            int max = Integer.MAX_VALUE;
            for (int i = 0; i < this.functions.size(); i++) {
                if (this.functions.get(i).getLowerBound(k) < max)
                    max = this.functions.get(i).getLowerBound(k);
            }
            lowerBounds.add(max);
        }

        return lowerBounds;
    }
}