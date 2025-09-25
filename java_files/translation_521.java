import java.util.*;

public class Translation521 {
    public void add(int location, E object) {
    if (location >= 0 && location <= size) {
        LinkedList.Node<E> node = voidNode;
        if (location < (size / 2)) {
            for (int i = 0;
            i <= location;
            i++) {
                node = node.next;
            }
        }
        else {
            for (int i = size;
            i > location;
            i--) {
                node = node.prev;
            }
        }
        LinkedList.Node<E> prev = node.prev;
        LinkedList.Node<E> newNode = new Node<>(object, prev, node);
        prev.next = newNode;
        node.prev = newNode;
        size++;
        modCount++;
    }
    else {
        throw new IndexOutOfBoundsException();
    }
}