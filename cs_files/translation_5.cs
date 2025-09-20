using System;
using System.Collections.Generic;

public class Translation5
{
    public override long RamBytesUsed(){
    long sizeInByes = ((termOffsets != null) ? termOffsets.RamBytesUsed() : 0);
    sizeInByes += ((termDictOffsets != null) ? termDictOffsets.RamBytesUsed() : 0);
    return sizeInByes;
}
}