import java.util.*;

public class Translation664 {
    ublic override String ToString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[SXVDEX]\n");
    buffer.Append(" .grbit1 =").Append(HexDump.IntToHex(grbit1)).Append("\n");
    buffer.Append(" .grbit2 =").Append(HexDump.ByteToHex(grbit2)).Append("\n");
    buffer.Append(" .citmShow =").Append(HexDump.ShortToHex(citmShow)).Append("\n");
    buffer.Append(" .isxdiSort =").Append(HexDump.ShortToHex(isxdiSort)).Append("\n");
    buffer.Append(" .isxdiShow =").Append(HexDump.ShortToHex(isxdiShow)).Append("\n");
    buffer.Append(" .subName =").Append(subName).Append("\n");
    buffer.Append("[/SXVDEX]\n");
    return buffer.ToString();
}
}