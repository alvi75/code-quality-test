import java.util.*;

public class Generated_636767611a6d9265ec018116 {
    private Set<V> intersection(Set<V> set1,Set<V> set2){
		Set<V> intersect = new HashSet<V>(set1);
		intersect.retainAll(set2);
		return intersect;
	}
}