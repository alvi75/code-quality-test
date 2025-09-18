import java.util.*;

public class Translation970 {
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[SXPI]\n");
    for (int i = 0;
    i < fieldInfos.length;
    i++) {
        sb.append(" .").append(fieldNames[i]).append(" = ").append(fieldInfos[i].debugInfo());
        if (fieldInfos[i].hasPayloads()) {
            sb.append(" (").append(payloads[i].length).append(")");
        }
        if (fieldInfos[i].hasContexts()) {
            sb.append(" (").append(contexts[i].length).append(")");
        }
        sb.append("\n");
    }
    sb.append("[/SXPI]\n");
    return sb.toString();
}
}