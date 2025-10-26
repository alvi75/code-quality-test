import java.util.*;

public class Translation205 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[DBCELL]\n");
    buffer.append(" .rowoffset = ").append(Integer.toHexString(rowOffset)).append("\n");
    for (int k = 0;
    k < cellOffsets.length;
    k++) {
        buffer.append(" .cell_").append(k).append(" = ").append(HexDump.shortToHex(cellOffsets[k])).append("\n");
    }
    buffer.append("[/DBCELL]\n");
    return buffer.toString();
}
}