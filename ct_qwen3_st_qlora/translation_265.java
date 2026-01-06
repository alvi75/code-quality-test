import java.util.*;

public class Translation265 {
    ublic String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getName()).append(" [ARRAY]\n");
    sb.append(" range=").append(getRange()).append("\n");
    sb.append(" options=").append(HexDump.shortToHex(_options)).append("\n");
    sb.append(" notUsed=").append(HexDump.intToHex(_field3notUsed)).append("\n");
    sb.append(" formula:").append("\n");
    Ptg[] ptgs = _formula.getTokens();
    for (int i = 0;
    i < ptgs.length;
    i++) {
        Ptg ptg = ptgs[i];
        sb.append(ptg.toString()).append(ptg.getRVAType()).append("\n");
    }
    sb.append("]");
    return sb.toString();
}
}