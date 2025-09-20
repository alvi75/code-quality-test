using System;
using System.Collections.Generic;

public class Translation521
{
    public override void add(int location, E @object){
    if (location >= 0 && location <= _size){
        java.util.LinkedList.Link<E> link = voidLink;
        if (location < (_size / 2)){
            {
                for (int i = 0;
                i <= location;
                i++){
                    link = link.next;
                }
            }
        }
        else{
            {
                for (int i = _size;
                i > location;
                i--){
                    link = link.previous;
                }
            }
        }
        java.util.LinkedList.Link<E> previous = link.previous;
        java.util.LinkedList.Link<E> newLink = new java.util.LinkedList.Link<E>(@object, previous, link);
        previous.next = newLink;
        link.previous = newLink;
        _size++;
        modCount++;
    }
    else{
        throw new System.IndexOutOfRangeException();
    }
}
}