import java.util.*;

public class Generated_636767611a6d9265ec018116 {
    private Set<V> intersection(Set<V> set1,Set<V> set2){
        Set<V> result = new HashSet<V>();
        Iterator<V> it = set1.iterator();
        while(it.hasNext()){
            V element = it.next();
            if(set2.contains(element)){
                result.add(element);
            }
        }
        return result;
    }
}