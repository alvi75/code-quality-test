import java.util.*;

public class Translation810 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[FILESHARING]\n");
    buffer.append(" .readonly = ").append(getReadOnly() == 1 ? "true" : "false").append("\n");
    buffer.append(" .password = ").append(new String(password)).append("\n");
    buffer.append(" .username = ").append(username).append("\n");
    buffer.append("[/FILESHARING]\n");
    return buffer.toString();
}
}