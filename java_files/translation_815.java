import java.util.*;

public class Translation815 {
    public final void serialize(LittleEndianOutput out) {
    out.writeByte(getPane());
    out.writeShort(getActiveCellRow());
    out.writeShort(getActiveCellCol());
    out.writeShort(getActiveCellRef());
    out.writeShort(field_6_refs.length);
    for (CellRangeAddress ref : field_6_refs) {
        ref.serialize(out);
    }
}
}