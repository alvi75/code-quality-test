using System;
using System.Collections.Generic;

public class Translation875
{
    public override java.nio.FloatBuffer slice(){
    byteBuffer.limit(_limit * libcore.io.SizeOf.FLOAT);
    byteBuffer.position(_position * libcore.io.SizeOf.FLOAT);
    java.nio.ByteBuffer bb = byteBuffer.slice().order(byteBuffer.order());
    java.nio.FloatBuffer result = new java.nio.FloatToByteBufferAdapter(bb);
    byteBuffer.clear();
    return result;
}
}