import java.util.*;

public class Translation979 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[BLANK]\n");
    buffer.append("row = ").append(HexDump.shortToHex(getRow())).append("\n");
    buffer.append("column = ").append(HexDump.shortToHex(getColumn())).append("\n");
    buffer.append("XFindex = ").append(HexDump.shortToHex(getXFAt()).append("\n");
    buffer.append("[/BLANK]\n");
    return buffer.toString();
}
}