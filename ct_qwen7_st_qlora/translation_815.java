import java.util.*;

public class Translation815 {
    public void serialize(LittleEndianOutput out) {
    out.writeByte(getPane());
    out.writeShort(getActiveCellRow());
    out.writeShort(getActiveCellColumn());
    out.writeShort(getActiveCellRef());
    int nRefs = _refs.length;
    out.writeShort(nRefs);
    for(int i=0;
    i<nRefs;
    i++) {
        _refs[i].serialize(out);
    }
}
}