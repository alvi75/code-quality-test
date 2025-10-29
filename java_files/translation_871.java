import java.util.*;

public class Translation871 {
    public ColumnInfoRecord(RecordInputStream in) {
    firstCol = in.readUShort();
    lastCol = in.readUShort();
    colWidth = in.readUShort();
    xfIndex = in.readUShort();
    options = in.readUShort();
    switch (in.remaining()) {
        case 2: field_6_reserved = in.readUShort();
        break;
        case 1: field_6_reserved = in.readByte();
        break;
        case 0:field_6_reserved = 0;
        break;
        default:throw new RuntimeException("Unusual record size remaining=" + in.remaining());
    }
}
}