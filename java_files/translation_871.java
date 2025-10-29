import java.util.*;

public class Translation871 {
    ublic ColumnInfoRecord(RecordInputStream in) {
    _firstCol = in.ReadShort();
    _lastCol = in.ReadShort();
    _colWidth = in.ReadShort();
    _xfIndex = in.ReadShort();
    _options = in.ReadShort();
    switch (in.Remaining) {
        case 2: _reserved = in.ReadShort();
        break;
        case 1:_reserved = in.ReadByte();
        break;
        case 0:_reserved = 0;
        break;
        default:throw new RecordFormatException("Unexpected number of bytes remaining (" + in.Remaining + ")");
    }
}
}