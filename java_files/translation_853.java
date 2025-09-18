import java.util.*;

public class Translation853 {
    public void write(LittleEndianOutput out) {
    out.writeByte(sid + getPtgClass());
    out.writeByte(_field_3_string.length());
    out.writeByte(_is16bitUnicode ? 0x01 : 0x00);
    if(_is16bitUnicode) {
        StringUtil.putUnicodeLE(_field_3_string, out);
    }
    else {
        StringUtil.putCompressedUnicode(_field_3_string, out);
    }
}
}