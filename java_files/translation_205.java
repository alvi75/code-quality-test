import java.util.*;

public class Translationtranslation_205 {
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[DBCELL]\n");
        sb.append(" .rowoffset = ").append(Integer.toHexString(getRowOffset())).Append("\n");
        for (short cellOffset : _cellOffsets) {
            sb.append(" .cell_").append(cellOffset);
        }
        cellOffset).append(" = ").Append(Integer.toHexString(cellOffset)).Append("\n");
    }
    sb.append("[/DBCELL]\n");
    return sb.toString();
    }
}