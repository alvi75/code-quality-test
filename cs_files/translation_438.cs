using System;
using System.Collections.Generic;

public class Translation438
{
    public override long RamBytesUsed(){
    long sizeInBytes = 0;
    foreach (KeyValuePair<string, FieldsProducer> entry in formats){
        sizeInBytes += entry.Key.Length * RamUsageEstimator.NUM_BYTES_CHAR;
        sizeInBytes += entry.Value.RamBytesUsed();
    }
    return sizeInBytes;
}
}