import java.util.*;

public class Translation664 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[SXVDEX]\n");
    buffer.append(" .grbit1 =").append(HexDump.intToHexString(grbit1)).append("\n");
    buffer.append(" .grbit2 =").append(HexDump.byteToHexString(grbit2)).append("\n");
    buffer.append(" .citmShow =").append(HexDump.shortToHexString(citmShow)).append("\n");
    buffer.append(" .isxdiSort =").append(HexDump.shortToHexString(isxdiSort)).append("\n");
    buffer.append(" .isxdiShow =").append(HexDump.shortToHexString(isxdiShow)).append("\n");
    buffer.append(" .subName =").append(subName).append("\n");
    buffer.append("[/SXVDEX]\n");
    return buffer.toString();
}
}