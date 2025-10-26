import java.util.*;

public class Translation733 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[CHART]\n");
    buffer.append(" .x = ").append("0x").append(HexDump.toHex(x)).append(" (").append(x).append(" )\n");
    buffer.append(" .y = ").append("0x").append(HexDump.toHex(y)).append(" (").append(y).append(" )\n");
    buffer.append(" .width = ").append("0x").append(HexDump.toHex(width)).append(" (").append(width).append(" )\n");
    buffer.append(" .height = ").append("0x").append(HexDump.toHex(height)).append(" (").append(height).append(" )\n");
    buffer.append("[/CHART]\n");
    return buffer.toString();
}
}