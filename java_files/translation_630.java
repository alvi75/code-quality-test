import java.util.*;

public class Translation630 {
    01 public String toString() {
    02 StringBuffer buffer = new StringBuffer();
    03 buffer.append("[BACKUP]\n");
    04 buffer.append(" .backup = ").append(StringUtil.toHexString(backup)).append("\n");
    05 buffer.append("[/BACKUP]\n");
    06 return buffer.toString();
    07 }
}