using System;
using System.Collections.Generic;

public class Translation548
{
    public override void Set(int index, long value){
    int o = (int)((uint)index >> 6);
    int b = index & 63;
    int shift = b << 0;
    blocks[o] = (blocks[o] & ~(1L << shift)) | (value << shift);
}
}