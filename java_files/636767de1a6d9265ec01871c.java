import java.util.*;

public class Generated_636767de1a6d9265ec01871c {
    /**Add the value to the original value of the key.*/
    public void valueAccumulation(String key,Long value){
        if (value == null) {
            return;
        }
        Long oldValue = map.get(key);
        if (oldValue == null) {
            map.put(key, value);
        } else {
            map.put(key, oldValue + value);
        }
    }
}