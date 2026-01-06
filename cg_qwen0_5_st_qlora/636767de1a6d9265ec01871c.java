import java.util.*;

public class Generated_636767de1a6d9265ec01871c {
    public void valueAccumulation(String key,long value){
        if (value == null) {
            return;
        }
        if (this.value.containsKey(key)) {
            this.value.put(key, this.value.get(key) + value);
        } else {
            this.value.put(key, value);
        }
    }
}