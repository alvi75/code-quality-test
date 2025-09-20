using System;
using System.Collections.Generic;

public class Translation110
{
    public override void Serialize(ILittleEndianOutput out1){
    out1.WriteShort(field_1_number_crn_records);
    out1.WriteShort(field_2_sheet_table_index);
}
}