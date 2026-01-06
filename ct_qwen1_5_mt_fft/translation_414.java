import java.util.*;

public class Translation414 {
    public int lastIndexOf(Object object) {
    if (object != null) {
        for (int i = size() - 1;
        i >= 0;
        i--) {
            Object e = getQuick(i);
            if (object.equals(e)) {
                return i;
            }
        }
    }
    else {
        for (int i = size() - 1;
        i >= 0;
        i--) {
            Object e = getQuick(i);
            if (e == null) {
                return i;
            }
        }
    }
    return -1;
}
}