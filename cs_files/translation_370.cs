using System;
using System.Collections.Generic;

public class Translation370
{
    public override void Set(int index, long value){
    int o = (int)((uint)index >> 5);
    int b = index & 31;
    int shift = b << 1;
    blocks[o] = (blocks[o] & ~(3L << shift)) | (value << shift);
}
}