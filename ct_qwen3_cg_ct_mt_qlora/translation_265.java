import java.util.*;

public class Translation265 {
    ublic String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getName()).append(" [ARRAY]\n");
    sb.append(" range=").append(range.toString()).append("\n");
    sb.append(" options=").append(Integer.toHexString(options)).append("\n");
    sb.append(" notUsed=").append(Integer.toHexString(field3NotUsed)).append("\n");
    sb.append(" formula:").append("\n");
    Ptg[] ptgs = formula.tokens;
    for (int i = 0;
    i < ptgs.length;
    i++) {
        Ptg ptg = ptgs[i];
        sb.append(ptg.toString()).append(ptg.rvAtype).append("\n");
    }
    sb.append("]");
    return sb.toString();
}
}