using System;
using System.Collections.Generic;

public class Translation603
{
    public sealed override int getInt(int index){
    checkIndex(index, libcore.io.SizeOf.INT);
    return libcore.io.Memory.peekInt(backingArray, offset + index, _order);
}
}