import java.util.*;

public class Translation733 {
    1 public String toString() {
    2 StringBuffer buffer = new StringBuffer();
    3 buffer.append("[CHART]\n");
    4 buffer.append(" .x = ").append("0x").append(HexDump.toHex(getX())).append(" (").append(getX()).append(" )");
    5 buffer.append("\n");
    6 buffer.append(" .y = ").append("0x").append(HexDump.toHex(getY())).append(" (").append(getY()).append(" )");
    7 buffer.append("\n");
    8 buffer.append(" .width = ").append("0x").append(HexDump.toHex(getWidth())).append(" (").append(getWidth()).append(" )");
    9 buffer.append("\n");
    10 buffer.append(" .height = ").append("0x").append(HexDump.toHex(getHeight())).append(" (").append(getHeight()).append(" )");
    11 buffer.append("\n");
    12 buffer.append("[/CHART]\n");
    13 return buffer.toString();
}
}