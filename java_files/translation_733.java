import java.util.*;

public class Translation733 {
    ublic String ToString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[CHART]\n");
    buffer.Append(" .x = ").Append("0x").Append(HexDump.ToHex(_x)).Append(" (").Append(_x).Append(" )");
    buffer.Append(Environment.NewLine);
    buffer.Append(" .y = ").Append("0x").Append(HexDump.ToHex(_y)).Append(" (").Append(_y).Append(" )");
    buffer.Append(Environment.NewLine);
    buffer.Append(" .width = ").Append("0x").Append(HexDump.ToHex(_width)).Append(" (").Append(_width).Append(" )");
    buffer.Append(Environment.NewLine);
    buffer.Append(" .height = ").Append("0x").Append(HexDump.ToHex(_height)).Append(" (").Append(_height).Append(" )");
    buffer.Append(Environment.NewLine);
    buffer.Append("[/CHART]\n");
    return buffer.ToString();
}
}