using System;
using System.Collections.Generic;

public class Translation516
{
    public override void Decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations){
    for (int j = 0;
    j < iterations;
    ++j){
        var block = blocks[blocksOffset++];
        values[valuesOffset++] = ((int)((uint)block >> 7)) & 1;
        values[valuesOffset++] = ((int)((uint)block >> 6)) & 1;
        values[valuesOffset++] = ((int)((uint)block >> 5)) & 1;
        values[valuesOffset++] = ((int)((uint)block >> 4)) & 1;
        values[valuesOffset++] = ((int)((uint)block >> 3)) & 1;
        values[valuesOffset++] = ((int)((uint)block >> 2)) & 1;
        values[valuesOffset++] = ((int)((uint)block >> 1)) & 1;
        values[valuesOffset++] = block & 1;
    }
}
}