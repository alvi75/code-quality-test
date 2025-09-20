using System;
using System.Collections.Generic;

public class Translation237
{
    public override long RamBytesUsed(){
    return RamUsageEstimator.AlignObjectSize(RamUsageEstimator.NUM_BYTES_OBJECT_HEADER+ 2 * RamUsageEstimator.NUM_BYTES_INT32)+ RamUsageEstimator.SizeOf(blocks);
}
}