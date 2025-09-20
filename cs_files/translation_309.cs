using System;
using System.Collections.Generic;

public class Translation309
{
    public override void Decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations){
    if (bitsPerValue > 32){
        throw new System.NotSupportedException("Cannot decode " + bitsPerValue + "-bits values into an int[]");
    }
    for (int i = 0;
    i < iterations;
    ++i){
        long block = ReadInt64(blocks, blocksOffset);
        blocksOffset += 8;
        valuesOffset = Decode(block, values, valuesOffset);
    }
    int remainingBlocks = (blocks.Length - blocksOffset) / 8;
    Debug.Assert(remainingBlocks >= 0);
    Debug.Assert(remainingBlocks <= m_maxBlocks);
    if (remainingBlocks > 0){
        blocks[blocksOffset++] = 0;
    }
    _valuesAgg.Decode(blocks, blocksOffset, values, valuesOffset, remainingBlocks);
}
}