import java.util.*;

public class Translation871 {
    public ColumnInfoRecord(RecordInputStream in) {
    _first_col = in.readUShort();
    _last_col = in.readUShort();
    _col_width = in.readUShort();
    _xf_index = in.readUShort();
    _options = in.readUShort();
    switch (in.remaining()) {
        case 2:_reserved = in.readUShort();
        break;
        case 1:_reserved = in.readByte();
        break;
        case 0: _reserved = 0;
        break;
        default:throw new RuntimeException("Unusual record size remaining (" + in.remaining() + ")");
    }
}
}