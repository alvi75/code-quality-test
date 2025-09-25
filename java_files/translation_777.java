import java.util.*;

public class Translation777 {
    public static void writeUnicodeStringFlagAndData(LittleEndianOutput out, String value) {
    boolean hasMultibyte = StringUtil.hasMultibyte(value);
    out.writeByte(hasMultibyte ? 0x01 : 0x00);
    if (hasMultibyte) {
        StringUtil.putUnicodeLE(value, out);
    }
    else {
        StringUtil.putCompressedUnicode(value, out);
    }
}
}