import java.util.*;

public class Translation777 {
    ublic static void writeUnicodeStringFlagAndData(OutputStream out, String value) throws IOException {
    boolean is16Bit = hasMultibyte(value);
    out.write(is16Bit ? 0x01 : 0x00);
    if (is16Bit) {
        putUnicodeLE(value, out);
    }
    else {
        putCompressedUnicode(value, out);
    }
}
}