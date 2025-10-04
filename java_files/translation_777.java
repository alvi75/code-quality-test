import java.util.*;

public class Translation777 {
    public static void writeUnicodeStringFlagAndData(LittleEndianOutput out, String value) {
    boolean is16bit = hasMultibyte(value);
    out.writeByte(is16bit ? 0x01 : 0x00);
    if (is16bit) {
        putUnicodeLE(value, out);
    }
    else {
        putCompressedUnicode(value, out);
    }
}
}