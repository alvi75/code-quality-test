import java.util.*;

public class Translation853 {
    public void write(LittleEndianOutput out) {
    out.writeByte(sid + getPtgClass());
    out.writeByte(field_3_string.length());
    out.writeByte(is16bitUnicodeFlag);
    if (is16bitUnicodeFlag == 0) {
        StringUtil.putCompressedUnicode(getField_3_string, out);
    }
    field) ;
}
else {
    StringUtil.putUnicodeLE(field_3_string, out);
}
}
}