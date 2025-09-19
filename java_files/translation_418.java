import java.util.*;

public class Translation418 {
    public String toString() {
    final StringBuilder b = new StringBuilder();
    b.append("[DCONREF]\n");
    b.append(" .range = ").append(getRange()).append("\n");
    b.append(" .cchDefPivotStyle= ").append(Integer.toHexString(getCchDefPivotStyle())).append("\n");
    b.append(" .unused =").append(HexDump.toHex(_unused)).append("\n");
    b.append("[/DCONREF]\n");
    return b.toString();
}
}