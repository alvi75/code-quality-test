import java.util.*;

public class Translation810 {
    ublic String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[FILESHARING]\n");
    buffer.append(" .readonly = ").append(readOnly == 1 ? "true" : "false").append("\n");
    buffer.append(" .password = ").append(HexDump.toHex(password)).append("\n");
    buffer.append(" .username = ").append(username).append("\n");
    buffer.append("[/FILESHARING]\n");
    return buffer.toString();
}
}