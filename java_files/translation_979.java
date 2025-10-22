import java.util.*;

public class Translation979 {
    ublic String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[BLANK]\n");
    buffer.append(" row = ").append(HexDump.shortToHex(getRow())).append("\n");
    buffer.append(" col = ").append(HexDump.shortToHex(getColumn())).append("\n");
    buffer.append(" xf = ").append(HexDump.shortToHex(getXFIndex())).append("\n");
    buffer.append("[/BLANK]\n");
    return buffer.toString();
}
}