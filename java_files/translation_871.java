import java.util.*;

public class Translationtranslation_871 {
    public ColumnInfoRecord(RecordInputStream in) {
        _firstCol = in.readUShort();
        _lastCol = in.readUShort();
        _options = in.readUShort();
        switch (in.remaining()) {
            case 2:_reserved = in.readUShort();
            break;
            case 1:_reserved = in.readByte();
            break;
            case 0:;
            break;
            default:throw new RuntimeException("Unexpected record size ("+ in.remaining() + ")");
        }
    }
}