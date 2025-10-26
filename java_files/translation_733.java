import java.util.*;

public class Translation733 {
    ublic override String ToString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[CHART]\n");
    buffer.Append(" .x = ").Append("0x").Append(HexDump.ToHex(X)).Append(" (").Append(X).Append(" )");
    buffer.Append(Environment.NewLine);
    buffer.Append(" .y = ").Append("0x").Append(HexDump.ToHex(Y)).Append(" (").Append(Y).Append(" )");
    buffer.Append(Environment.NewLine);
    buffer.Append(" .width = ").Append("0x").Append(HexDump.ToHex(Width)).Append(" (").Append(Width).Append(" )");
    buffer.Append(Environment.NewLine);
    buffer.Append(" .height = ").Append("0x").Append(HexDump.ToHex(Height)).Append(" (").Append(Height).Append(" )");
    buffer.Append(Environment.NewLine);
    buffer.Append("[/CHART]\n");
    return buffer.ToString();
}
}