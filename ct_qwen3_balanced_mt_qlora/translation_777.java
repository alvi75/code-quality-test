import java.util.*;

public class Translation777 {
    ublic static void writeUnicodeStringFlagAndData(LittleEndianOutput out1, String value) {
    boolean is16Bit = hasMultibyte(value);
    out1.writeByte(is16Bit ? 0x01 : 0x00);
    if (is16Bit) {
        putUnicodeLE(value, out1);
    }
    else {
        putCompressedUnicode(value, out1);
    }
}
}