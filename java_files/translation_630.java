import java.util.*;

public class Translation630 {
    ublic String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[BACKUP]\n");
    buffer.append(" .options = ").append(HexDump.shortToHex(_options)).append("\n");
    buffer.append("[/BACKUP]\n");
    return buffer.toString();
}
}