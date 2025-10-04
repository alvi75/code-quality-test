import java.util.*;

public class Translation418 {
    public String toString() {
    final StringBuilder b = new StringBuilder();
    b.append("[DCONREF]\n");
    b.append(" .ref = ").append(ref).append('\n');
    b.append(" .firstrow = ").append(firstRow).append('\n');
    b.append(" .lastrow = ").append(lastRow).append('\n');
    b.append(" .firstcol = ").append(firstCol).append('\n');
    b.append(" .lastcol = ").append(lastCol).append('\n');
    b.append(" .cch = ").append(field_4_cch).append('\n');
    b.append(" .stFile = ").append(stFile).append('\n');
    b.append(" .h = ").append(charType).append('\n');
    b.append(" .rgb = ").append(readablePath).append('\n');
    b.append("[/DCONREF]\n");
    return b.toString();
}
}