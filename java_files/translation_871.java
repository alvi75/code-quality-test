import java.util.*;

public class Translation871 {
    public ColumnInfoRecord(RecordInputStream in) {
    field_1_first_col = in.readShort();
    field_2_last_col = in.readShort();
    field_3_col_width = in.readShort();
    field_4_xf_index = in.readShort();
    field_5_options = in.readShort();
}
}