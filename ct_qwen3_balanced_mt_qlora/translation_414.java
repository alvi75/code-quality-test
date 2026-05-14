import java.util.*;

public class Translation414 {
    ublic int lastIndexOf(Object object) {
    final int size = size();
    final LinkedList.Link<E> link = voidLink.previous;
    for (int i = size - 1;
    i >= 0;
    i--) {
        if (Objects.equals(object, link.data)) {
            return i;
        }
        link = link.previous;
    }
    return -1;
}
}