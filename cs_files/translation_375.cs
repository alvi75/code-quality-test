using System;
using System.Collections.Generic;

public class Translation375
{
    public virtual java.util.List<E> subList(int start, int end){
    lock (mutex){
        return new java.util.Collections.SynchronizedRandomAccessList<E>(list.subList(start, end), mutex);
    }
}
}