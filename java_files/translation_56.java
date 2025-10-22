import java.util.*;

public class Translation56 {
    ublic void serialize(LittleEndianOutput out) {
    out.writeShort(field_1_row);
    out.writeShort(field_2_col);
    out.writeShort(field_3_flags);
    out.writeShort(field_4_shapeid);
    out.writeShort(field_6_author.length);
    out.writeByte(field_5_hasMultibyte ? 0x01 : 0x00);
    if (field_5_hasMultibyte) {
        StringHelper.putUnicodeLE(field_6_author, out);
    }
    else {
        StringHelper.putCompressedUnicode(field_6_author, out);
    }
    if (field_7_padding != null) {
        out.writeByte(Integer.parseInt(field_7_padding, 10));
    }
}
}