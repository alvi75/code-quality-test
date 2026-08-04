import java.util.*;

public class Generated_6367674a1a6d9265ec017da9 {
    private void moveAllListNodes(DoublyLinkedList<E> list){
        if(list.isEmpty())
            return;
        DoublyLinkedList<E> newList = new DoublyLinkedList<E>();
        DoublyLinkedList<E> oldList = list;
        list = list.getNext();
        while(list != oldList){
            newList.add(list.getData());
            list = list.getNext();
        }
        list = newList;
    }
}