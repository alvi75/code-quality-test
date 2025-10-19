import java.util.*;

public class Generated_636766f11a6d9265ec01764f {
    public Collection<Object> values(){
        List<Object> result = new ArrayList<>();
        for (Entry<String, Object> entry : map.entrySet()){
            if(entry.getValue() != null){
                result.add(entry.getValue());
            }
        }
        return Collections.unmodifiableList(result);
    }
}