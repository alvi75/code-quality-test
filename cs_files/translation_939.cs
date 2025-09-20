using System;
using System.Collections.Generic;

public class Translation939
{
    public BlankRecord(RecordInputStream in1){
    field_1_row = in1.ReadUShort();
    field_2_col = in1.ReadUShort();
    field_3_xf = in1.ReadShort();
    field_4_not_used = in1.ReadShort();
}
}