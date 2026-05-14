import java.util.*;

public class Translation815 {
    public void serialize(LittleEndianOutput out) {
    out.writeByte(_pane);
    out.writeShort(_activeCellRow);
    out.writeShort(_activeCellCol);
    out.writeShort(_activeCellRefIndex);
    int nRefs = _refIndices.length;
    out.writeShort(nRefs);
    for(int i=0;
    i<nRefs;
    i++) {
        out.writeShort(_refIndices[i]);
    }
}
}