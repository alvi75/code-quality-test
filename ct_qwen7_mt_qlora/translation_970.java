import java.util.*;

public class Translation970 {
    1 public String toString() {
    2 StringBuffer buffer = new StringBuffer();
    3 buffer.append("[SXPI]\n");
    4 for (int i=0;
    i<_fieldInfos.length;
    i++) {
        5 buffer.append(" item[").append(i).append("]=");
        6 _fieldInfos[i].appendDebugInfo(buffer);
        7 buffer.append("\n");
        8 }
        9 buffer.append("[/SXPI]\n");
        10 return buffer.toString();
    }
}