import java.util.*;

public class Generated_636767de1a6d9265ec01871c {
    public void valueAccumulation(String key,long value){
        if (value == null) {
            return;
        }
        if (!keyToValue.containsKey(key)) {
            keyToValue.put(key,value);
        } else {
            keyToValue.put(key,keyToValue.get(key)+value);
        }
    }
}