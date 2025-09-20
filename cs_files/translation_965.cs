using System;
using System.Collections.Generic;

public class Translation965
{
    public virtual void Set(int index, long n){
    if (count < index){
        throw Sharpen.Extensions.CreateIndexOutOfRangeException(index);
    }
    else{
        if (count == index){
            Add(n);
        }
        else{
            entries[index] = n;
        }
    }
}
}