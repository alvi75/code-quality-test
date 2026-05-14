import java.util.*;

public class Translation810 {
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[FILESHARING]\n");
    sb.append(" .readonly = ").append(isReadOnly() ? "true" : "false").append("\n");
    sb.append(" .password = ").append(HexDump.shortToHex(getPassword())).append("\n");
    sb.append(" .username = ").append(getUsername()).append("\n");
    sb.append("[/FILESHARING]\n");
    return sb.toString();
}
}