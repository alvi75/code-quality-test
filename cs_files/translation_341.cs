using System;
using System.Collections.Generic;

public class Translation341
{
    public override java.nio.IntBuffer put(int[] src, int srcOffset, int intCount){
    java.util.Arrays.checkOffsetAndCount(src.Length, srcOffset, intCount);
    if (intCount > remaining()){
        throw new java.nio.BufferOverflowException();
    }
    {
        for (int i = srcOffset;
        i < srcOffset + intCount;
        ++i){
            put(src[i]);
        }
    }
    return this;
}
}