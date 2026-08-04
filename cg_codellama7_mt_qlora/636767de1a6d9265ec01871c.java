import java.util.*;

public class Generated_636767de1a6d9265ec01871c {
    public void valueAccumulation(String key, long value) {
        Long oldValue = map.get(key);
        if (oldValue == null) {
            map.put(key, value);
        } else {
            map.put(key, oldValue + value);
        }
    }
}