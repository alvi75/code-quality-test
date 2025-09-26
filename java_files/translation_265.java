import java.util.*;

public class Translation265 {
    1 public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getName()).append(" [ARRAY]\n");
    sb.append(" range=").append(getRange().toString()).append("\n");
    sb.append(" options=").append(Integer.toHexString(_options)).append("\n");
    sb.append(" notUsed=").append(Integer.toHexString(_field3notUsed)).append("\n");
    sb.append(" formula:").append("\n");
    Ptg[] ptgs = _formula.getTokens();
    for (int i = 0;
    i < ptgs.length;
    i++) {
        Ptg ptg = ptgs[i];
        sb.append(ptg.toString()).append(ptg.rvatype).append("\n");
    }
    sb.append("]");
    return sb.toString();
}
}