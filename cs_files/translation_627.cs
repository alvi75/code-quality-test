using System;
using System.Collections.Generic;

public class Translation627
{
    public override void Serialize(ILittleEndianOutput out1){
    out1.WriteShort(LeftRowGutter);
    out1.WriteShort(TopColGutter);
    out1.WriteShort(RowLevelMax);
    out1.WriteShort(ColLevelMax);
}
}