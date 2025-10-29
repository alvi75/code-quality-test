import java.util.*;

public class Translation821 {
    01 public String toString() {
    02 StringBuffer buffer = new StringBuffer();
    03 buffer.append("[SCENARIOPROTECT]\n");
    04 buffer.append(" .protect = ").append(protect).append("\n");
    05 buffer.append("[/SCENARIOPROTECT]\n");
    06 return buffer.toString();
    07 }
}