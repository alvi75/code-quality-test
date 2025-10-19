import java.util.*;

public class Generated_636766f11a6d9265ec01764f {
    /**Return an unmodifiable list that contains all methods in the BeanMap.**/
public Collection<Object> values(){
        List<Object> result = new ArrayList<Object>();
        for (Object key : this.keySet()){
            result.add(this.get(key));
        }
        return Collections.unmodifiableCollection(result);
    }
}