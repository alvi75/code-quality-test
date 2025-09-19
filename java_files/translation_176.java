import java.util.*;

public class Translation176 {
    public BookSheetKeyRecord(RecordInputStream in) {
    field_1_hold = in.readUByte();
    field_2_v_hold = in.readUByte();
    field_3_width = in.readShort();
    field_4_height = in.readShort();
    field_5_options = in.readShort();
    field_6_active_sheet_index = in.readShort();
    field_7_first_visible_sheet_index = in.readShort();
    field_8_num_selected_sheets = in.readUShort();
    field_9_sheet_width_ratio = in.readShort();
}
}