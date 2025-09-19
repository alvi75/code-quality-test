import java.util.*;

public class Translation205 {
    ublic String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[DBCELL]\n");
    sb.append(" rowoffset = ").append(HexDump.shortToHex(getRowOffset())).append("\n");
    for(int k = 0;
    k < getNumCellOffsets();
    k++) {
        sb.append(" cell_").append(k).append(" = ").append(HexDump.shortToHex(getCellOffset(k))).append("\n");
    }
    sb.append("[/DBCELL]\n");
    return sb.toString();
}
}