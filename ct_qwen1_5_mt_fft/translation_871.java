import java.util.*;

public class Translation871 {
    public ColumnInfoRecord(RecordInputStream in) {
    int nColumns = in.remaining() / 3;
    field_1_first_column = in.readUShort();
    field_2_last_column = in.readUShort();
    field_3_column_width = in.readUShort();
    field_4_xf_index = in.readUShort();
    field_5_options = in.readUShort();
    if (nColumns == 0) {
        field_7_zero = 0;
    }
    else if (nColumns * 3 == in.remaining()) {
        field_7_zero = in.readInt();
    }
    else {
        throw new RecordFormatException("Unexpected remaining data");
    }
}
}