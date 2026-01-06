import java.util.*;

public class Generated_636767611a6d9265ec018116 {
    /**Return the intersection between two sets.
@see #intersection(Set, Set)
@param set1 first set
@param set2 second set
@return the intersection of both sets or null if one is empty
*/
public static <V> Set<V> intersection(Set<V> set1,Set<V> set2){
	if(set1==null || set2==null) return null;
	Set<V> result=new HashSet<V>();
	for(V v:set1){
		if(set2.contains(v))result.add(v);
	}
	return result.size()==0?null:result;
}
}