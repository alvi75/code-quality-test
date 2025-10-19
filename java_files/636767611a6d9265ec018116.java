import java.util.*;

public class Generated_636767611a6d9265ec018116 {
    /**Return the intersection between two sets.**/
    private Set<V> intersection(Set<V> set1,Set<V> set2){
        HashSet<V> result = new HashSet<V>(set1);
        result.retainAll(set2);
        return result;
    }
}