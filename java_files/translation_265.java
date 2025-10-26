import java.util.*;

public class Translation265 {
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getName()).append("[ARRAY]\n");
    sb.append(" range=").append(range.toString()).append("\n");
    sb.append(" options=").append(HexDump.shortToHex(options)).append("\n");
    sb.append(" notUsed=").append(HexDump.intToHex(field_3_notUsed)).append("\n");
    sb.append(" formula:\n");
    sb.append(formula);
    return sb.toString();
}
}