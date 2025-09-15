import java.util.*;

public class Translationtranslation_970 {
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
            if (payloads[i] != null) {
                sb.append("\n");
                payloads[i].appendDebugInfo(sb);
            }
            sb.append("
}