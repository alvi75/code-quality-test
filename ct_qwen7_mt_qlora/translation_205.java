import java.util.*;

public class Translation205 {
    1 public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[DBCELL]\n");
    buffer.append(" .rowoffset = ").append(Integer.toHexString(getRowOffset())).append("\n");
    for (int k = 0;
    k < _cell_offsets.length;
    k++) {
        buffer.append(" .cell_").append(k).append(" = ").append(HexDump.shortToHex(_cell_offsets[k])).append("\n");
    }
    buffer.append("[/DBCELL]\n");
    return buffer.toString();
}
}