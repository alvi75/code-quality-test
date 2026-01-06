import java.util.*;

public class Translation853 {
    ublic void write(LittleEndianOutput out) {
    out.writeByte(sid + PtgClass);
    out.writeByte(field_3_string.length);
    out.writeByte(is16bitUnicode ? 0x01 : 0x00);
    if (is16bitUnicode) {
        StringUtil.putUnicodeLE(field_3_string, out);
    }
    else {
        StringUtil.putCompressedUnicode(field_3_string, out);
    }
}
}