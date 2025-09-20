using System;
using System.Collections.Generic;

public class Translation532
{
    public virtual E get(int location){
    try{
        return (E)a[location];
    }
    catch (System.IndexOutOfRangeException){
        throw new System.ArgumentException(location + " not accessible in an array of length " + a.Length);
    }
}
}