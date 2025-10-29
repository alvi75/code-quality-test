import java.util.*;

public class Translation810 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[FILESHARING]\n");
    buffer.append(" .readOnly = ").append(ReadOnly==1?"true":"false").append("\n");
    buffer.append(" .password = ").append(StringUtil.toHexString(Password)).append("\n");
    buffer.append(" .username = ").append(Username).append("\n");
    buffer.append("[/FILESHARING]\n");
    return buffer.toString();
}
}