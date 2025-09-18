import java.util.*;

public class Translation815 {
    public void serialize(LittleEndianOutput out) {
    out.writeByte(getPane());
    out.writeShort(getActiveCellRow());
    out.writeShort(getActiveCellCol());
    out.writeShort(getActiveCellRef());
    int nRefs = field_6_refs.length;
    out.writeShort(nRefs);
    for (int i = 0;
    i < field_6_refs.length;
    i++) {
        field_6_refs[i].serialize(out);
    }
}
}