import java.util.*;

public class Translation777 {
    public static void writeUnicodeStringFlagAndData( LittleEndianOutput out1, String value ) {
    boolean is16bit = hasMultibyte(value);
    out1.writeByte((byte) (is16bit ? 0x01 : 0x00));
    if (is16bit) {
        putUnicodeLE(value, out1 );
    }
    else {
        putCompressedUnicode(value, out1 );
    }
}
}