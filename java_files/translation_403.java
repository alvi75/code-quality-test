import java.util.*;

public class Translation403 {
    01 public String toString() {
    02 StringBuffer buffer = new StringBuffer();
    03 buffer.append("[MMS]\n");
    04 buffer.append(" .addMenu = ").append(StringUtil.toHexString(addMenuCount)).append("\n");
    05 buffer.append(" .delMenu = ").append(StringUtil.toHexString(delMenuCount)).append("\n");
    06 buffer.append("[/MMS]\n");
    07 return buffer.toString();
    08 }
}