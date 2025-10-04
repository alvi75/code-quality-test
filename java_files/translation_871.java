import java.util.*;

public class Translation871 {
    public ColumnInfoRecord(RecordInputStream in) {
    _firstCol = in.readUShort();
    _lastCol = in.readUShort();
    _colWidth = in.readUShort();
    _xfIndex = in.readUShort();
    _options = in.readUShort();
    switch (in.remaining()) {
        case 2:_reserved = in.readUShort();
        break;
        case 1:_reserved = in.readByte();
        break;
        case 0:_reserved = 0;
        break;
        default:throw new RecordFormatException("Unexpected remaining size ("+ in.remaining() + ")");
    }
}
}