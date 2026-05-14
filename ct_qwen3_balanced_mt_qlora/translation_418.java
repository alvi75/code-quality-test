import java.util.*;

public class Translation418 {
    ublic String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[DCONREF]\n");
    buffer.append(" .ref\n");
    buffer.append(" .firstrow = ").append(getFirstRow()).append("\n");
    buffer.append(" .lastrow = ").append(getLastRow()).append("\n");
    buffer.append(" .firstcol = ").append(getFirstCol()).append("\n");
    buffer.append(" .lastcol = ").append(getLastCol()).append("\n");
    buffer.append(" .cch = ").append(getCharCount()).append("\n");
    buffer.append(" .stFile\n");
    buffer.append(" .h = ").append(getCharType()).append("\n");
    buffer.append(" .rgb = ").append(getReadablePath()).append("\n");
    buffer.append("[/DCONREF]\n");
    return buffer.toString();
}
}