import java.util.*;

public class Translationtranslation_418 {
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("[DCONREF]\n");
        b.append(" .ref\n");
        b.append(" .firstrow = ").append(firstRow).append("\n");
        b.append(" .lastrow = ").append(lastRow).append("\n");
        b.append(" .firstcol = ").append(firstCol).append("\n");
        b.append(" .lastcol = ").append(lastCol).append("\n");
        b.append(" .charcount = ").append(charCount).append("\n");
        b.append(" .stfile\n");
        b.append(" .type = ").append(charType).append("\n");
        b.append(" .path = ").append(getReadablePath()).append("\n");
        b.append("[/DCONREF]\n");
        return b.toString();
    }
}