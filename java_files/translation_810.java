import java.util.*;

public class Translation810 {
    ublic String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[FILESHARING]\n");
    buffer.append(" .readonly = ").append(readonly == 1 ? "true" : "false").append("\n");
    buffer.append(" .password = ").append(StringUtil.toHexString(password)).append("\n");
    buffer.append(" .username = ").append(username).append("\n");
    buffer.append("[/FILESHARING]\n");
    return buffer.toString();
}
}