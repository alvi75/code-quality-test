import java.util.*;

public class Translation265 {
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getName()).append(" [ARRAY]\n");
    sb.append(" range=").append(range.toString()).append("\n");
    sb.append(" options=").append(HexDump.shortToHex(options)).append("\n");
    sb.append(" notUsed=").append(HexDump.intToHex(field_3_notUsed)).append("\n");
    sb.append(" formula:\n");
    Ptg[] ptgs = formula.tokens;
    for (int i = 0;
    i < ptgs.length;
    i++) {
        Ptg ptg = ptgs[i];
        sb.append(ptg.toString()).append(ptg.rvaType).append("\n");
    }
    sb.append("]");
    return sb.toString();
}
}