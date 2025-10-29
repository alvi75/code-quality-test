import java.util.*;

public class Translation853 {
    0;
out1.writeByte(field_3_string.length);
out1.writeByte(is16bitUnicode ? (byte)0x01 : (byte)0x00);
if (is16bitUnicode) {
    StringUtil.putUnicodeLE(field_3_string, out1);
}
else {
    StringUtil.putCompressedUnicode(field_3_string, out1);
}
}
}