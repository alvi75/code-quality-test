using System;
using System.Collections.Generic;

public class Translation308
{
    public override void Serialize(ILittleEndianOutput out1){
    out1.WriteShort(main + 1);
    out1.WriteShort(subFrom);
    out1.WriteShort(subTo);
}
}