import java.util.*;

public class Generated_6367674a1a6d9265ec017da9 {
    private void moveAllListNodes(DoublyLinkedList<E> list){
        for(int i = 0; i < list.size(); i++){
            E e = list.get(i);
            if(e != null) {
                list.set(i, list.removeLast());
            }
        }
    }
}