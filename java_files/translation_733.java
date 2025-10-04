import java.util.*;

public class Translation733 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[CHART]\n");
    buffer.append(" .x = ").append("0x").append(HexDump.toHex( getX())).append(" (").append( getX() ).append(" )");
    buffer.append(System.getProperty("line.separator"));
    buffer.append(" .y = ").append("0x").append(HexDump.toHex( getY())).append(" (").append( getY() ).append(" )");
    buffer.append(System.getProperty("line.separator"));
    buffer.append(" .width = ").append("0x").append(HexDump.toHex( getWidth())).append(" (").append( getWidth() ).append(" )");
    buffer.append(System.getProperty("line.separator"));
    buffer.append(" .height = ").append("0x").append(HexDump.toHex( getHeight())).append(" (").append( getHeight() ).append(" )");
    buffer.append(System.getProperty("line.separator"));
    buffer.append("[/CHART]\n");
    return buffer.toString();
}
}