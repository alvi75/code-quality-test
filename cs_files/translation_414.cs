using System;
using System.Collections.Generic;

public class Translation414
{
    public virtual int lastIndexOf(object @object){
    int pos = _size;
    java.util.LinkedList.Link<E> link = voidLink.previous;
    if (@object != null){
        while (link != voidLink){
            pos--;
            if (@object.Equals(link.data)){
                return pos;
            }
            link = link.previous;
        }
    }
    else{
        while (link != voidLink){
            pos--;
            if ((object)link.data == null){
                return pos;
            }
            link = link.previous;
        }
    }
    return -1;
}
}