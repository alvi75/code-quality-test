import java.util.*;

public class Translation265 {
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getName());
    sb.append("[ARRAY]\n");
    sb.append(" range=").append(getRange().toString()).append("\n");
    sb.append(" options=").append(HexDump.shortToHex(_options)).append("\n");
    sb.append(" notUsed=").append(HexDump.intToHex(_field3NotUsed)).append("\n");
    sb.append(" formula:").append("\n");
    Ptg[] ptgs = getFormula().tokens();
    for (int i = 0;
    i < ptgs.length;
    i++) {
        Ptg ptg = ptgs[i];
        sb.append(ptg.toString()).append(ptg.ravtype()).append("\n");
    }
    sb.append("]");
    return sb.toString();
}
}