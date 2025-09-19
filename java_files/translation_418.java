import java.util.*;

public class Translation418 {
    ublic String toString() {
    StringBuilder b = new StringBuilder();
    b.append("[DCONREF]\n");
    b.append(" .ref\n");
    b.append(" .firstrow = ").append(firstRow).append("\n");
    b.append(" .lastrow = ").append(lastRow).append("\n");
    b.append(" .firstcol = ").append(firstCol).append("\n");
    b.append(" .lastcol = ").append(lastCol).append("\n");
    b.append(" .charcount = ").append(charCount).append("\n");
    b.append(" .stringtype = ").append(getStringType()).append("\n");
    b.append(" .pathlength = ").append(pathLength).append("\n");
    b.append(" .path = ").append(getPath()).append("\n");
    b.append("[/DCONREF]\n");
    return b.toString();
}
}