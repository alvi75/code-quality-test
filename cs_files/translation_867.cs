using System;
using System.Collections.Generic;

public class Translation867
{
    public override java.nio.ShortBuffer put(short[] src, int srcOffset, int shortCount){
    byteBuffer.limit(_limit * libcore.io.SizeOf.SHORT);
    byteBuffer.position(_position * libcore.io.SizeOf.SHORT);
    if (byteBuffer is java.nio.ReadWriteDirectByteBuffer){
        ((java.nio.ReadWriteDirectByteBuffer)byteBuffer).put(src, srcOffset, shortCount);
    }
    else{
        ((java.nio.ReadWriteHeapByteBuffer)byteBuffer).put(src, srcOffset, shortCount);
    }
    this._position += shortCount;
    return this;
}
}