import java.util.*;

public class Translationtranslation_56 {
    public void serialize(LittleEndianOutput out) {
        out.writeShort( field_1_row );
        out.writeShort(int) field_2_col);
        out.writeShort(int) field_3_flags);
        out.writeShort(int) field_4_shapeid);
        out.writeByte(field_6_author.length());
        out.writeByte(field_5_hasMultibyte ? 0x01 : 0x00);
        if (field_5_hasMultibyte) {
            StringUtil.putUnicodeLE(field_6_author, out);
        }
        else {
            StringUtil.putCompressedUnicode(field_6_author, out);
        }
        if (field_7_padding != null) {
            out.writeByte(field_7_padding.intValue());
        }
    }
}