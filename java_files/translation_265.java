import java.util.*;

public class Translation265 {
    1: public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getName());
    sb.append(" [ARRAY]\n");
    sb.append(" range=").append(getRange().toString());
    sb.append("\n");
    sb.append(" options=").append(Integer.toHexString(_options));
    sb.append("\n");
    sb.append(" notUsed=").append(Integer.toHexString(_field3NotUsed));
    sb.append("\n");
    sb.append(" formula:");
    for (int i=0;
    i<ptgs.length;
    i++) {
        Ptg ptg = ptgs[i];
        sb.append(ptg.toString());
        sb.append(ptg.getRVAType());
        sb.append("\n");
    }
    sb.append("]");
    return sb.toString();
}
}