import java.util.*;

public class Translation958 {
    ublic String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[RIGHTMARGIN]\n");
    buffer.append(" .margin = ").append(" (").append(getMargin()).append(" )");
    buffer.append(System.getProperty("line.separator"));
    buffer.append("[/RIGHTMARGIN]\n");
    return buffer.toString();
}
}