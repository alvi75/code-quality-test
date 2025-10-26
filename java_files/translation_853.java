import java.util.*;

public class Translation853 {
    ublic override void Write(LittleEndianOutput out1){
    out1.WriteByte(sid + PtgClass);
    out1.WriteByte(field_3_string.Length);
    out1.writeByte(_is16bitUnicode ? 0x01 : 0x00);
    if (_is16bitUnicode) {
        StringUtil.putUnicodeLE(field_3_string, out1);
    }
    else {
        StringUtil.putCompressedUnicode(field_3_string, out1);
    }
}
}