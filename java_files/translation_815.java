import java.util.*;

public class Translation815 {
    public void serialize(LittleEndianOutput out) {
    out.writeByte(getPane());
    out.writeInt(getActiveCellRow());
    out.writeInt(getActiveCellCol());
    out.writeShort(CellRangeAddress.serializeRange(intCount));
}
}