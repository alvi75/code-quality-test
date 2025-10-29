import java.util.*;

public class Translation970 {
    01 public String toString() {
    02 StringBuffer sb = new StringBuffer();
    03 sb.append("[SXPI]\n");
    04 for (int i = 0;
    i < fieldInfos.length;
    i++) {
        05 sb.append(" item[").append(i).append("]=");
        06 fieldInfos[i].appendDebugInfo(sb);
        07 sb.append('\n');
        08 }
        09 sb.append("[/SXPI]\n");
        10 return sb.toString();
    }
}