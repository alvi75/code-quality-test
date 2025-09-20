using System;
using System.Collections.Generic;

public class Translation586
{
    public override void Write(ILittleEndianOutput out1){
    out1.WriteByte(sid + PtgClass);
    out1.WriteShort(field_1_len_ref_subexpression);
}
}