import java.util.*;

public class Translation205 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[DBCELL]\n");
    buffer.append(" .rowoffset = ").append(HexDump.shortToHex(getRowOffset())).append("\n");
    for (int k = 0;
    k < _cellOffsets.length;
    k++) {
        buffer.append(" .cell_").append(k).append(" = ").append(HexDump.shortToHex(_cellOffsets[k])).append("\n");
    }
    buffer.append("[/DBCELL]\n");
    return buffer.toString();
}
}