import java.util.*;

public class Translation414 {
    public int lastIndexOf(Object object) {
    final int pos = size;
    java.util.LinkedList.Link<E> link = voidLink.previous;
    if (object != null) {
        while (link != voidLink) {
            pos--;
            if (object.equals(link.data)) {
                return pos;
            }
        }
        return -1;
    }
    else {
        while (link != voidLink) {
            pos--;
            if (link.data == null) {
                return pos;
            }
        }
        return -1;
    }
}
}