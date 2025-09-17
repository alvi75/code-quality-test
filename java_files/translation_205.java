import java.util.*;

public class Translationtranslation_205 {
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("[DBCELL]\n");
        buffer.append(" .rowoffset = ").append(Integer.toHexString(getRowOffset())).append("\n");
        for (short cellOffset : field_2_cell_offsets) {
            buffer.append(" .cell_").append(cellOffset).append(" = ").append(Integer.toHexString(cellOffset)).append("\n");
        }
        buffer.append("[/DBCELL]\n");
        return buffer.toString();
    }
}