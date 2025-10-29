import java.util.*;

public class Translation777 {
    ublic static void WriteUnicodeStringFlagAndData(ILittleEndianOutput out1, String value) {
    boolean is16Bit = HasMultibyte(value);
    out1.writeByte(is16Bit ? 0x01 : 0x00);
    if (is16Bit) {
        PutUnicodeLE(value, out1);
    }
    else {
        PutCompressedUnicode(value, out1);
    }
}
}