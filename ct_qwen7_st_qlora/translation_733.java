import java.util.*;

public class Translation733 {
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[CHART]\n");
    sb.append(" .x = ").append("0x").append(HexDump.toHex( getX ())).append(" (").append( getX() ).append(" )");
    sb.append(System.getProperty("line.separator"));
    sb.append(" .y = ").append("0x").append(HexDump.toHex( getY ())).append(" (").append( getY() ).append(" )");
    sb.append(System.getProperty("line.separator"));
    sb.append(" .width = ").append("0x").append(HexDump.toHex( getWidth ())).append(" (").append( getWidth() ).append(" )");
    sb.append(System.getProperty("line.separator"));
    sb.append(" .height = ").append("0x").append(HexDump.toHex( getHeight ())).append(" (").append( getHeight() ).append(" )");
    sb.append(System.getProperty("line.separator"));
    sb.append("[/CHART]\n");
    return sb.toString();
}
}