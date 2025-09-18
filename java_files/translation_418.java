import java.util.*;

public class Translation418 {
    public String toString() {
    StringBuilder b = new StringBuilder();
    b.append("[DCONREF]\n");
    b.append(" .ref\n");
    b.append(" .firstrow = ").append(firstRow).append("\n");
    b.append(" .lastrow = ").append(lastRow).append("\n");
    b.append(" .firstcol = ").append(firstCol).append("\n");
    b.append(" .lastcol = ").append(lastCol).append("\n");
    b.append(" .cch = ").append(charCount).append("\n");
    b.append(" .stFile\n");
    b.append(" .h = ").append(charType).append("\n");
    b.append(" .rgb = ").append(getReadablePath()).append("\n");
    b.append("[/DCONREF]\n");
    return b.toString();
}
}