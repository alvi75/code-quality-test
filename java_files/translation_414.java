import java.util.*;

public class Translation414 {
    ublic int lastIndexOf(Object o) {
    int pos = size;
    Link<E> link = voidLink.previous;
    while (link != voidLink) {
        pos-- ;
        if (o.equals(link.data)) {
            return pos;
        }
        link = link.previous;
    }
    return -1;
}
}