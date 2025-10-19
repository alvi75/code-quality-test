import java.util.*;

public class Generated_636767de1a6d9265ec01871c {
    /**
 * Add the value to the original value of the key.
 **/
public void valueAccumulation(String key,Long value){
        if (value == null) {
            return;
        }
        Long oldValue = this.get(key);
        if (oldValue != null) {
            this.put(key, oldValue + value);
        } else {
            this.put(key, value);
        }
    }
}