import java.util.*;

public class Translation979 {
    ublic override String toString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[BLANK]\n");
    buffer.Append("row = ").Append(HexDump.shortToHex(Row)).Append("\n");
    buffer.Append("col = ").Append(HexDump.shortToHex(Column)).Append("\n");
    buffer.Append("xf = ").Append(HexDump.shortToHex(XFIndex)).Append("\n");
    buffer.Append("[/BLANK]\n");
    return buffer.ToString();
}
}