using System;
using System.Collections.Generic;

public class Translation317
{
    public override void Decode(long[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations){
    for (int i = 0;
    i < iterations;
    ++i){
        long block = blocks[blocksOffset++];
        for (int shift = 48;
        shift >= 0;
        shift -= 16){
            values[valuesOffset++] = (int)(((long)((ulong)block >> shift)) & 65535);
        }
    }
}
}