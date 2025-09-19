import java.util.*;

public class Translation810 {
    ublic String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[FILESHARING]\n");
    buffer.append(" .readonly = ").append(getReadOnly()).append("\n");
    buffer.append(" .password = ").append(HexDump.shortToHex(getPassword())).append("\n");
    buffer.append(" .username = ").append(getUsername()).append("\n");
    buffer.append("[/FILESHARING]\n");
    return buffer.toString();
}
}