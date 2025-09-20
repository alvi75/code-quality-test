using System;
using System.Collections.Generic;

public class Translation928
{
    public override void Serialize(ILittleEndianOutput out1){
    out1.WriteShort(field_1_barSpace);
    out1.WriteShort(field_2_categorySpace);
    out1.WriteShort(field_3_formatFlags);
}
}