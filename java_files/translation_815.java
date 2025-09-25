import java.util.*;

public class Translation815 {
    public void serialize(LittleEndianOutput out) {
    out.writeByte(pane);
    out.writeShort(activeCellRow);
    out.writeShort(activeCellCol);
    out.writeShort(activeCellRef);
    int nRefs = field_6_refs.length;
    out.writeShort(nRefs);
    for (int i = 0;
    i < nRefs;
    i++) {
        field_6_refs[i].serialize(out);
    }
}
}