import java.util.*;

public class Translation664 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[SXVDEX]\n");
    buffer.append(" .grbit1=").append(HexDump.intToHex(grbit1)).append("\n");
    buffer.append(" .grbit2=").append(HexDump.byteToHex(grbit2)).append("\n");
    buffer.append(" .citmShow=").append(HexDump.byteToHex(citmShow)).append("\n");
    buffer.append(" .isxdiSort=").append(HexDump.shortToHex(isxdiSort)).append("\n");
    buffer.append(" .isxdiShow=").append(HexDump.shortToHex(isxdiShow)).append("\n");
    buffer.append(" .subName=").append(subName).append("\n");
    buffer.append("[/SXVDEX]\n");
    return buffer.toString();
}
}