using System;
using System.Collections.Generic;

public class Translation345
{
    public int[] ToArray(int[] a){
    int[] rval = new int[_limit];
    Array.Copy(_array, 0, rval, 0, _limit);
    return rval;
}
}