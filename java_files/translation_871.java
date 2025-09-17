import java.util.*;

public class Translationtranslation_871 {
    public ColumnInfoRecord(RecordInputStream in) {
        _firstCol = in.readUShort();
        _lastCol = in.readUShort();
        _colWidth = in.readUShort();
        _xfIndex = in.readUShort();
        _options = in.readUShort();
        switch (in.remaining()) {
            case 2:field_6_reserved = in.readUShort();
            break;
            case 1:field_6_reserved = in.readByte();
            break;
            case 0:field_6_reserved = 0;
            break;
            default:throw new RecordFormatException("Unexpected remaining size ("+ in.remaining() + ")");
        }
    }
}