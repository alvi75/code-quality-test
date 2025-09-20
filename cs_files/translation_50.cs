using System;
using System.Collections.Generic;

public class Translation50
{
    public virtual int indexOfValue(int value){
    for (int i = 0;
    i < mSize;
    i++){
        if (mValues[i] == value){
            return i;
        }
    }
    return -1;
}
}