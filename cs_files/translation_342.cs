using System;
using System.Collections.Generic;

public class Translation342
{
    public virtual void TrimToSize(){
    int s = _size;
    if (s == _array.Length){
        return;
    }
    if (s == 0){
        _array = libcore.util.EmptyArray.OBJECT;
    }
    else{
        object[] newArray = new object[s];
        System.Array.Copy(_array, 0, newArray, 0, s);
        _array = newArray;
    }
    modCount++;
}
}