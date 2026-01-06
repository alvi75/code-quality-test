import java.util.*;

public class Translation414 {
    public int lastIndexOf(Object object) {
    final int size = this.size();
    for (int i = size - 1;
    i >= 0;
    i--) {
        if (object.equals(get(i))) {
            return i;
        }
    }
    return -1;
}
}