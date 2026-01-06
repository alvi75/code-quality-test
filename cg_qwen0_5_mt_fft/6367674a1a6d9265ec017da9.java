import java.util.*;

public class Generated_6367674a1a6d9265ec017da9 {
    private void moveAllListNodes(DoublyLinkedList<E> list){
        int size = list.size();
        for (int i = 0; i < size; i++) {
            E e = list.get(i);
            add(e, i);
        }
    }
}