import java.util.*;

public class Translation979 {
    ublic String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[BLANK]\n");
    sb.append(" .row = ").append(HexDump.shortToHex(getRow())).append("\n");
    sb.append(" .column = ").append(HexDump.shortToHex(getColumn())).append("\n");
    sb.append(" .xfindex = ").append(HexDump.shortToHex(getXFIndex())).append("\n");
    sb.append("[/BLANK]\n");
    return sb.toString();
}
}