import java.util.*;

public class Translation205 {
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[DBCELL]\n");
    sb.append(" .rowoffset = ").append(Integer.toHexString(getRowOffset())).append("\n");
    for(int i=0;
    i<field_2_cell_offsets.length;
    i++) {
        sb.append(" .cell_").append(i).append(" = ").append(HexDump.shortToHex(field_2_cell_offsets[i])).append("\n");
    }
    sb.append("[/DBCELL]\n");
    return sb.toString();
}
}