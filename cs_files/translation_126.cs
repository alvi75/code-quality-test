using System;
using System.Collections.Generic;

public class Translation126
{
    public virtual void Add(char[] output, int offset, int len, int endOffset, int posLength){
    if (count == outputs.Length){
        var newOutputs = new char[ArrayUtil.Oversize(outputs.Length + 1, RamUsageEstimator.NUM_BYTES_CHAR)][];
        Array.Copy(outputs, 0, newOutputs, 0, outputs.Length);
        outputs = newOutputs;
    }
    if (count == endOffsets.Length){
        int[] next = new int[ArrayUtil.Oversize(1 + count, RamUsageEstimator.NUM_BYTES_INT32)];
        Array.Copy(endOffsets, 0, next, 0, count);
        endOffsets = next;
    }
    if (count == posLengths.Length){
        int[] next = new int[ArrayUtil.Oversize(1 + count, RamUsageEstimator.NUM_BYTES_INT32)];
        Array.Copy(posLengths, 0, next, 0, count);
        posLengths = next;
    }
    if (outputs[count] == null){
        outputs[count] = new CharsRef();
    }
    outputs[count].CopyChars(output, offset, len);
    endOffsets[count] = endOffset;
    posLengths[count] = posLength;
    count++;
}
}
}