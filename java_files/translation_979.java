import java.util.*;

public class Translation979 {
    public final String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[BLANK]\n");
    sb.append(" .row = ").append(HexDump.shortToHex(getRow())).Append("\n");
    sb.append(" .col =").append(HexDump.shortToHex(getColumn())).Append("\n");
    sb.append(" .xf_index_raw=").append(HexDump.shortToHex(field_5_xf_index)).append("\n");
    if(isBuiltin()) {
        sb.append(" .builtin_style = ").append(HexDump.byteToHex(field_6_builtin_style).append("\n");
    }
    else {
        sb.append(" .name = ").append(getName()).append("\n");
    }
    sb.append("[/BLANK]\n");
    return sb.toString();
}
}