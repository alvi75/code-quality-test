import java.util.*;

public class Translation265 {
    public final String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append(getClass().getName()).append(" [ARRAY]\n");
    sb.append(" .range = ").append(getRange()).append("\n");
    sb.append(" .flags = ") .append(HexDump.shortToHex(field_5_flags)).append("\n");
    sb.append(" .array = ").append(array()).append("\n");
    sb.append(" .format = ").append(format()).append("\n");
    if(unused() != null) {
        sb.append(" .unused = ").append(unused()).append("\n");
    }
    sb.append("[/ARRAY]\n");
    return sb.toString();
}
}