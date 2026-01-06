import java.util.*;

public class Translation403 {
    ublic String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[MMS]\n");
    buffer.append(" .addMenu = ").append(HexDump.intToHex(addMenuCount)).append("\n");
    buffer.append(" .delMenu = ").append(HexDump.intToHex(delMenuCount)).append("\n");
    buffer.append("[/MMS]\n");
    return buffer.toString();
}
}