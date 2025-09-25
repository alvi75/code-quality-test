import java.util.*;

public class Translation815 {
    public void serialize(LittleEndianOutput out) {
    out.writeByte(getPane());
    out.writeShort(getActiveCellRow());
    out.writeShort(getActiveCellCol());
    out.writeShort(getActiveCellRef());
    int nRefs = getNumRefs();
    out.writeShort(nRefs);
    for (int i=0;
    i<getNumRefs();
    i++) {
        field_6_refs[i].serialize(out);
    }
}