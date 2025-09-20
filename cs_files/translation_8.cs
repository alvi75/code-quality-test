using System;
using System.Collections.Generic;

public class Translation8
{
    public virtual void Init(int address){
    Slice = pool.Buffers[address >> ByteBlockPool.BYTE_BLOCK_SHIFT];
    Debug.Assert(slice != null);
    upto = address & ByteBlockPool.BYTE_BLOCK_MASK;
    offset0 = address;
    Debug.Assert(upto < slice.Length);
}
}