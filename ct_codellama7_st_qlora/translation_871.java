import java.util.*;

public class Translation871 {
    public ColumnInfoRecord(RecordInputStream in) {
    _first_col = in.readUShort();
    _last_col = in.readUShort();
    _col_width = in.readUShort();
    _xf_index = in.readUShort();
    _options = in.readUShort();
    switch(in.remaining()) {
        case 2:field_6_reserved = in.readUShort();
        break;
        case 1:field_6_reserved = in.readByte();
        break;
        case 0:field_6_reserved = 0;
        break;
        default:throw new RuntimeException("Unexpected remaining size (" + in.remaining() + ")");
    }
}
}