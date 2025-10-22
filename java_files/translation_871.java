import java.util.*;

public class Translation871 {
    ublic ColumnInfoRecord(RecordInputStream in) {
    _firstCol = in.readUShort();
    _lastCol = in.readUShort();
    _colWidth = in.readUShort();
    _xfIndex = in.readUShort();
    _options = in.readUShort();
    switch (in.remaining()) {
        case 2:field_6Reserved = in.readUShort();
        break;
        case 1:field_6Reserved = in.readByte();
        break;
        case 0:field_6Reserved = 0;
        break;
        default:throw new RuntimeException("Unusual record size remaining=(" + in.remaining() + ")");
    }
}
}