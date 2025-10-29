import java.util.*;

public class Translation56 {
    ublic void serialize(LittleEndianOutput out1) {
    out1.writeShort(field_1_row);
    out1.writeShort(field_2_col);
    out1.writeShort(field_3_flags);
    out1.writeShort(field_4_shapeid);
    out1.writeShort(field_6_author.length);
    out1.writeByte(field_5_hasMultibyte ? 0x01 : 0x00);
    if (field_5_hasMultibyte) {
        StringUtil.putUnicodeLE(field_6_author, out1);
    }
    else {
        StringUtil.putCompressedUnicode(field_6_author, out1);
    }
    if (field_7_padding != null) {
        out1.writeByte((int) field_7_padding);
    }
}
}