import java.util.*;

public class Generated_636767611a6d9265ec018116 {
    /**Return the intersection between two sets.*/
private Set<V> intersection(Set<V> set1,Set<V> set2){
		Set<V> result = new HashSet<V>();
		for(V v : set1)
			if(set2.contains(v))
				result.add(v);
		return result;
	}
}