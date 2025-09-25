import java.util.*;

public class Translation418 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[DCONREF]\n");
    buffer.append(" .ref\n");
    buffer.append(" .firstrow = ").append(firstRow).append("\n");
    buffer.append(" .lastrow = ").append(lastRow).append("\n");
    buffer.append(" .firstcol = ").append(firstCol).append("\n");
    buffer.append(" .lastcol = ").append(lastCol).append("\n");
    buffer.append(" .cch = ").append(charCount).append("\n");
    buffer.append(" .stFile\n");
    buffer.append(" .h = ").append(charType).append("\n");
    buffer.append(" .rgb = ").append(ReadablePath).append("\n");
    buffer.append("[/DCONREF]\n");
    return buffer.toString();
}
}