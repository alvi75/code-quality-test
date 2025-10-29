import java.util.*;

public class Translation815 {
    public void serialize(LittleEndianOutput out) {
    out.write(field_1_pane);
    out.writeShort(getActiveCellRow());
    out.writeShort(getActiveCellCol());
    out.writeShort(getActiveCellRef());
    int nRefs = getReferences().length;
    out.writeShort(nRefs);
    for (int i = 0;
    i < nRefs;
    i++) {
        getReferences()[i].serialize(out);
    }
}
}