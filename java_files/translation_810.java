import java.util.*;

public class Translation810 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[FILESHARING]\n");
    buffer.append(" .readonly = ").append(getReadOnly()).append("\n");
    buffer.append(" .password = ").append(HexDump.shortToHex(field_2_password)).append("\n");
    buffer.append(" .filename = ").append(getFileName()).append("\n");
    buffer.append("[/FILESHARING]\n");
    return buffer.toString();
}
}