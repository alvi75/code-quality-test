import java.util.*;

public class Translation418 {
    1 public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[DCONREF]\n");
    buffer.append(" .ref\n");
    buffer.append(" .firstrow = ").append(HexDump.shortToHex(getFirstRow())).append("\n");
    buffer.append(" .lastrow = ").append(HexDump.shortToHex(getLastRow())).append("\n");
    buffer.append(" .firstcol = ").append(HexDump.shortToHex(getFirstColumn())).append("\n");
    buffer.append(" .lastcol = ").append(HexDump.shortToHex(getLastColumn())).append("\n");
    buffer.append(" .cch = ").append(HexDump.shortToHex(_charCount)).append("\n");
    buffer.append(" .stFile\n");
    buffer.append(" .h = ").append(HexDump.shortToHex(_charType)).append("\n");
    buffer.append(" .rgb = ").append(ReadablePath).append("\n");
    buffer.append("[/DCONREF]\n");
    return buffer.toString();
}
}