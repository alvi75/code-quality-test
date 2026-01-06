import java.util.*;

public class Translation733 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[CHART]\n");
    buffer.append(" .x = ").append("0x").append(HexDump.toHex(X)).append(" (").append(X).append(" )");
    buffer.append(System.getProperty("line.separator"));
    buffer.append(" .y = ").append("0x").append(HexDump.toHex(Y)).append(" (").append(Y).append(" )");
    buffer.append(System.getProperty("line.separator"));
    buffer.append(" .width = ").append("0x").append(HexDump.toHex(Width)).append(" (").append(Width).append(" )");
    buffer.append(System.getProperty("line.separator"));
    buffer.append(" .height = ").append("0x").append(HexDump.toHex(Height)).append(" (").append(Height).append(" )");
    buffer.append(System.getProperty("line.separator"));
    buffer.append("[/CHART]\n");
    return buffer.toString();
}
}