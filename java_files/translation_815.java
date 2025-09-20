import java.util.*;

public class Translation815 {
    ublic void serialize(LittleEndianOutput out) {
    out.writeByte(getPane());
    out.writeShort(getActiveCellRow());
    out.writeShort(getActiveCellCol());
    out.writeShort(getActiveCellRef());
    int nRefs = _refs.length;
    out.writeShort(nRefs);
    for (int i=0;
    i<_refs.length;
    i++) {
        _refs[i].serialize(out);
    }
}
}