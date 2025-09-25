import java.util.*;

public class Translation205 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[DBCELL]\n");
    buffer.append(" .rowoffset = ").append(StringUtil.toHexString(RowOffset)).append("\n");
    for (int k = 0;
    k < field_2_cell_offsets.length;
    k++) {
        buffer.append(" .cell_").append(k).append(" = ").append(HexDump.shortToHex(field_2_cell_offsets[k])).append("\n");
    }
    buffer.append("[/DBCELL]\n");
    return buffer.toString();
}
}