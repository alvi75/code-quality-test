import java.util.*;

public class Translation815 {
    ublic void serialize(LittleEndianOutput out) {
    out.writeByte(getPane());
    out.writeShort(getActiveCellRow());
    out.writeShort(getActiveCellCol());
    out.writeShort(getActiveCellRef());
    final int nRefs = getRefs().length;
    out.writeShort(nRefs);
    for (int i = 0;
    i < getRefs().length;
    i++) {
        getRefs()[i].serialize(out);
    }
}
}