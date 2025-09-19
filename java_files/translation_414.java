import java.util.*;

public class Translation414 {
    public int lastIndexOf(Object object) {
    int pos = size;
    Link<E> link = voidLink.previous;
    if (object != null) {
        while (link != voidLink) {
            if (object.equals(link.data)) {
                return pos;
            }
            link = link.previous;
            pos--;
        }
    }
    else {
        while (link != voidLink) {
            if (link.data == null) {
                return pos;
            }
            link = link.previous;
            pos--;
        }
    }
    return -1;
}
}