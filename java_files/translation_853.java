import java.util.*;

public class Translation853 {
    public void write(LittleEndianOutput out) {
    out.writeByte(sid + getPtgClass());
    out.writeByte(field_3_string.length);
    out.writeByte(_is16bitUnicode ? 0x01 : 0x00);
    if (_is16bitUnicode) {
        StringUtil.putUnicodeLE(field_3_string, out);
    }
    else {
        StringUtil.putCompressedUnicode(field_3_string, out);
    }
}
}