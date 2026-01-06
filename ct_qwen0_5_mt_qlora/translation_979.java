import java.util.*;

public class Translation979 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[BLANK]\n");
    buffer.append("row = ").append(HexDump.shortToHex(row)).append("\n");
    buffer.append("col = ").append(HexDump.shortToHex(col)).append("\n");
    buffer.append("xf = ").append(HexDump.shortToHex(xfIndex)).append("\n");
    buffer.append("[/BLANK]\n");
    return buffer.toString();
}
}