import java.util.*;

public class Translation871 {
    public ColumnInfoRecord(RecordInputStream in) {
    _firstCol = in.readUByte();
    _lastCol = in.readUByte();
    _colWidth = in.readUShort();
    _xfIndex = in.readUShort();
    int nChars = in.readUByte();
    if (nChars == 0) {
        field_6_res = 0;
    }
    else {
        field_6_res = in.readUnicodeLEString(nChars);
    }
}
}