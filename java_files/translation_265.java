import java.util.*;

public class Translation265 {
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getName()).append(" [ARRAY]\n");
    sb.append(" range=").append(getRangeString()).append("\n");
    sb.append(" options=").append(HexDump.shortToHex(field_3_options)).append("\n");
    sb.append(" notUsed=").append(HexDump.intToHex(field_4_notUsed)).append("\n");
    sb.append(" formula:").append("\n");
    Ptg[] ptgs = getFormulaTokens();
    for (int i = 0;
    i < ptgs.length;
    i++) {
        Ptg ptg = ptgs[i];
        sb.append(ptg.toString()).append(ptg.getRT()).append("\n");
    }
    sb.append("]");
    return sb.toString();
}
}