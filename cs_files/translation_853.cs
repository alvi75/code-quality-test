using System;
using System.Collections.Generic;

public class Translation853
{
    public override void Write(ILittleEndianOutput out1){
    out1.WriteByte(sid + PtgClass);
    out1.WriteByte((byte)field_3_string.Length);
    out1.WriteByte(_is16bitUnicode ? 0x01 : 0x00);
    if (_is16bitUnicode){
        StringUtil.PutUnicodeLE(field_3_string, out1);
    }
    else{
        StringUtil.PutCompressedUnicode(field_3_string, out1);
    }
}
}