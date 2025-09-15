import java.util.*;

public class Translationtranslation_777 {
    public static void writeUnicodeStringFlagAndData(LittleEndianOutput out, String value) {
        boolean is16Bit = hasMultibyte(value);
        out.writeByte(is16Bit ? 0x01 : 0x00);
        if (is16Bit) {
            putUnicodeLE(value, out);
        }
        else {
            putCompressedUnicode(value, out);
        }
    }
}