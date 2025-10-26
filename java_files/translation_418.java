import java.util.*;

public class Translation418 {
    ublic override String ToString(){
    StringBuilder b = new StringBuilder();
    b.Append("[DCONREF]\n");
    b.Append(" .ref\n");
    b.Append(" .firstrow = ").Append(firstRow).Append("\n");
    b.Append(" .lastrow = ").Append(lastRow).Append("\n");
    b.Append(" .firstcol = ").Append(firstCol).Append("\n");
    b.Append(" .lastcol = ").Append(lastCol).Append("\n");
    b.Append(" .cch = ").Append(charCount).Append("\n");
    b.Append(" .stFile\n");
    b.Append(" .h = ").Append(charType).Append("\n");
    b.Append(" .rgb = ").Append(ReadablePath).Append("\n");
    b.Append("[/DCONREF]\n");
    return b.ToString();
}
}