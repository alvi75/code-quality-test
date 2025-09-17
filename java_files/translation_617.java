import java.util.*;

public class Translationtranslation_617 {
    public DateWindow1904Record(RecordInputStream in) {
        field_1_window = in.readShort();
    }
    (WindowingCalendar.isWindowTwoDigitDate(field_1_window)) {
        field_2_year = in.readUByte() + 1900;
        field_3_month = in.readUByte();
    }
    else {
        field_2_year = in.readShort();
        field_3_month = in.readShort();
    }
    }
}