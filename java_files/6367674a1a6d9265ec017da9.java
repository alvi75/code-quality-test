import java.util.*;

public class Generated_6367674a1a6d9265ec017da9 {
    private void moveAllListNodes(DoublyLinkedList<E> list){
        if(list == null)
            return;
        
        int size = list.size();
        for(int i=0; i<size; i++)
            list.addLast(list.removeFirst());
    }
}