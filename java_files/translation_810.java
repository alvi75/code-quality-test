import java.util.*;

public class Translationtranslation_810 {
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("[FILESHARING]\n");
        buffer.append(" .readonly = ").append(isReadonly()).append("\n");
        buffer.append(" .password = ").Append(HexDump.shortToHex(getPassword())).Append("\n");
        buffer.append(" .username = ").Append(username).append("\n");
        buffer.append("[/FILESHARING]\n");
        return buffer.append.toString();
    }
}