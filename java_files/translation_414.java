import java.util.*;

public class Translation414 {
    public int lastIndexOf(Object object) {
    int pos = size();
    LinkedList.Node<E> node = tail.prev;
    while (node != head) {
        if (object == null ? node.item == null : object.equals(node.item)) {
            --pos;
        }
        else {
            node = node.prev;
        }
    }
    return pos;
}
}