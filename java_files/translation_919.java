import java.util.*;

public class Translationtranslation_919 {
    public DBCellWithStatusRecord(RecordInputStream in) {
        field_1_row = in.readUShort();
        field_2_column = in.readShort();
        field_3_cell_type = in.readByte();
        field_4_formula1 = in.readDouble();
        field_5_formula2 = in.readDouble();
        field_6_not_used = in.readInt();
        field_7_adtl_info = in.readRemainder();
    }
}