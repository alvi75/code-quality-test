using System;
using System.Collections.Generic;

public class Translation436
{
    public static IntList LineMap(byte[] buf, int ptr, int end){
    IntList map = new IntList((end - ptr) / 36);
    map.FillTo(1, int.MinValue);
    for (;
    ptr < end;
    ptr = NextLF(buf, ptr)){
        map.Add(ptr);
    }
    map.Add(end);
    return map;
}
}