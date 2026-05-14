import java.util.*;

public class Translation414 {
    public int lastIndexOf(Object object) {
    int pos = size;
    for (Link<E> link = voidLink.previous;
    link != voidLink;
    link = link.previous, pos--) {
        if (object.equals(link.data)) {
            return pos;
        }
    }
    return -1;
}
}