using System;
using System.Collections.Generic;

public class Translation895
{
    public override int Get(int index, long[] arr, int off, int len){
    Debug.Assert(len > 0, "len must be > 0 (got " + len + ")");
    Debug.Assert(index >= 0 && index < valueCount);
    len = Math.Min(len, valueCount - index);
    for (int i = off;
    i < off + len;
    ++i){
        arr[i] = 0;
    }
    return len;
}
}