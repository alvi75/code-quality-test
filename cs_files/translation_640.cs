using System;
using System.Collections.Generic;

public class Translation640
{
    public override java.nio.LongBuffer get(long[] dst, int dstOffset, int longCount){
    byteBuffer.limit(_limit * libcore.io.SizeOf.LONG);
    byteBuffer.position(_position * libcore.io.SizeOf.LONG);
    if (byteBuffer is java.nio.DirectByteBuffer){
        ((java.nio.DirectByteBuffer)byteBuffer).get(dst, dstOffset, longCount);
    }
    else{
        ((java.nio.HeapByteBuffer)byteBuffer).get(dst, dstOffset, longCount);
    }
    this._position += longCount;
    return this;
}
}