import java.util.*;

public class Translation418 {
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[DCONREF]\n");
    sb.append(" .ref\n");
    sb.append(" .firstrow = ").append(getFirstRow()).append("\n");
    sb.append(" .lastrow = ").append(getLastRow()).append("\n");
    sb.append(" .firstcol = ").append(getFirstCol()).append("\n");
    sb.append(" .lastcol = ").append(getLastCol()).append("\n");
    sb.append(" .cch = ").append(getCharCount()).append("\n");
    sb.append(" .stFile\n");
    sb.append(" .h = ").append(getCharType()).append("\n");
    sb.append(" .rgb = ").append(getReadablePath()).append("\n");
    sb.append("[/DCONREF]\n");
    return sb.toString();
}
}