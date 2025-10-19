import java.util.*;

public class Generated_636767de1a6d9265ec01871c {
    /**Add the value to the original value of the key.
@param key The key for which the value is added.
@param value The value to add.
@throws IllegalArgumentException if the key does not exist in the map.
*/
public void valueAccumulation(String key,Long value){
        Long oldValue = get(key);
        set(key,value+oldValue);
    }
}