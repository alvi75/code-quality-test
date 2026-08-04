import java.util.*;

public class Translation418 {
    public String toString() {
    StringBuilder b = new StringBuilder();
    b.append("[DCONREF]\n");
    b.append(" .ref\n");
    b.append(" .firstrow = ").append(getFirstRow()).append("\n");
    b.append(" .lastrow = ").append(getLastRow()).append("\n");
    b.append(" .firstcol = ").append(getFirstCol()).append("\n");
    b.append(" .lastcol = ").append(getLastCol()).append("\n");
    b.append(" .cch = ").append(getCharCount()).append("\n");
    b.append(" .stFile\n");
    b.append(" .h = ").append(getCharType()).append("\n");
    b.append(" .rgb = ").append(getReadablePath()).append("\n");
    b.append("[/DCONREF]\n");
    return b.toString();
}
}