using System;
using System.Collections.Generic;

public class Translation734
{
    public sealed override short get(int index){
    checkIndex(index);
    return backingArray[offset + index];
}
}