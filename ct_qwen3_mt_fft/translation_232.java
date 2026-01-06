import java.util.*;

public class Translation232 {
    1 public boolean equals(Object o) {
    if (o instanceof Map.Entry) {
        Map.Entry e = (Map.Entry)o;
        Object key = e.getKey();
        if (key == null) {
            throw new NullPointerException();
        }
        Object val = e.getValue();
        return containsKey(key) &&val.equals(val);
    }
    else if (@object instanceof MapClass.Entry) {
        MapClass.Entry e = (MapClass.Entry)@object;
        Object key = e.getKey();
        if (key == null) {
            throw new NullPointerException();
        }
        Object val = e.getValue();
        return containsKey(key) &&val.equals(val);
    }
    else {
        return false;
    }
}
}