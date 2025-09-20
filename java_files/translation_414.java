import java.util.*;

public class Translation414 {
    public int lastIndexOf(Object object) {
    int pos = size();
    Link<E> link = voidLink.previous;
    if (object != null) {
        while (--pos >= 0 && link != voidLink) {
            if (object.equals(link.data)) {
                return pos;
            }
            link = link.previous;
        }
    }
    else {
        while (--pos >= 0 && link != voidLink) {
            if (link.data == null) {
                return pos;
            }
            link = link.previous;
        }
    }
    return -1;
}
}