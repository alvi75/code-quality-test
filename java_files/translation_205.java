import java.util.*;

public class Translation205 {
    ublic override String toString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[DBCELL]\n");
    buffer.Append(" .rowoffset = ").Append(StringUtil.toHexString(RowOffset)).Append("\n");
    for (int k = 0;
    k < field_2_cell_offsets.Length;
    k++){
        buffer.Append(" .cell_" + k + " = ").Append(HexDump.shortToHex(field_2_cell_offsets[k])).Append("\n");
    }
    buffer.Append("[/DBCELL]\n");
    return buffer.ToString();
}
}