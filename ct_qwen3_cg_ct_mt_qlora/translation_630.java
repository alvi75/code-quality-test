import java.util.*;

public class Translation630 {
    ublic String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[BACKUP]\n");
    buffer.append(" .backup = ").append(HexDump.toHex(backup)).append("\n");
    buffer.append("[/BACKUP]\n");
    return buffer.toString();
}
}