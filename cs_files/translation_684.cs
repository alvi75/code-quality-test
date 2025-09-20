using System;
using System.Collections.Generic;

public class Translation684
{
    public static BufferSize Automatic(){
    var rt = Runtime;
    var max = rt.MaxRecursionDepth;
    var total = rt.TotalMemory;
    var free = rt.FreeMemory;
    var bytesUsedPerValue = (free + ((max < 1024) ? 512 : 1024)) * 2;
    var overheadInBytes = 4 * bytesUsedPerValue;
    var bufferSize = OverheadInBytes + bytesUsedPerValue;
    return new BufferSize(bufferSize, overheadInBytes, latencyPenalty);
}
}