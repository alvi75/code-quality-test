import java.util.*;

public class Generated_636767611a6d9265ec018116 {
    private Set<V> intersection(Set<V> set1,Set<V> set2){
        if(set1.isEmpty() || set2.isEmpty()) return Collections.emptySet();
        
        //find the smallest of the 2 sets to minimize number of comparisons
        if(set1.size()>set2.size()){
            Set<V> tmp=set1;
            set1=set2;
            set2=tmp;
        }
        
        //perform intersection using the union find method
        DisjointSetForest forest=new DisjointSetForest(set1);
        for(V v: set2) {
            forest.union(v,set1.get(forest.find(v)));
        }
        
        //convert disjoint-set back into a set
        Set<V> result=new HashSet<>();
        for(V v: set1) {
            if(forest.getRoots().contains(v)) result.add(v);
        }
        return result;
    }
}