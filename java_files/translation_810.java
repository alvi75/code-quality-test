import java.util.*;

public class Translation810 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[FILESHARING]\n");
    buffer.append(" .readonly = ").append(isReadOnly()).append("\n");
    buffer.append(" .password = ").append(toHexString(password)).append("\n");
    buffer.append(" .username = ").append(username).append("\n");
    buffer.append("[/FILESHARING]\n");
    return buffer.toString();
}
}