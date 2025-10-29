import java.util.*;

public class Translation970 {
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[SXPI]\n");
    for (int i = 0;
    i < fieldInfos.length;
    i++) {
        sb.append(" ").append(fieldInfos[i]).append("\n");
    }
    sb.append("[/SXPI]\n");
    return sb.toString();
}
}