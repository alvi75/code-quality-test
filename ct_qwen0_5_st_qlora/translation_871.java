import java.util.*;

public class Translation871 {
    public ColumnInfoRecord(RecordInputStream in) {
    field_1_first_col = in.readUShort();
    field_2_last_col = in.readUShort();
    field_3_col_width = in.readUShort();
    field_4_xf_index = in.readUShort();
    field_5_options = in.readUShort();
    switch (in.remaining()) {
        case 2:field_6_reserved = in.readUShort();
        break;
        case 1:field_6_reserved = in.readByte();
        break;
        case 0:field_6_reserved = 0;
        break;
        default:throw new RuntimeException("Unusual record size remaining=" + in.remaining());
    }
}
}