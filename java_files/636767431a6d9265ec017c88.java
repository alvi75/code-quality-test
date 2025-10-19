import java.util.*;

public class Generated_636767431a6d9265ec017c88 {
    private List<Integer> computeLowerBounds(List<K> keys){
		List<Integer> lowerBound = new ArrayList<>();
		for(K k:keys){
			lowerBound.add(computeLowerBound(k));
		}
		return lowerBound;
	}
}