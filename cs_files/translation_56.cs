using System;
using System.Collections.Generic;

public class Translation56
{
    public override void Serialize(ILittleEndianOutput out1){
    out1.WriteShort(field_1_row);
    out1.WriteShort(field_2_col);
    out1.WriteShort(field_3_flags);
    out1.WriteShort(field_4_shapeid);
    out1.WriteShort(field_6_author.Length);
    out1.WriteByte(field_5_hasMultibyte ? 0x01 : 0x00);
    if (field_5_hasMultibyte){
        StringUtil.PutUnicodeLE(field_6_author, out1);
    }
    else{
        StringUtil.PutCompressedUnicode(field_6_author, out1);
    }
    if (field_7_padding != null){
        out1.WriteByte(field_7_padding & 0xFF);
    }
}
}