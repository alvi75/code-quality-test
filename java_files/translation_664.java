import java.util.*;

public class Translation664 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[SXVDEX]\n");
    buffer.append(" .grbit1 =").append(HexDump.intToHex(getGrbit1())).append("\n");
    buffer.append(" .grbit2 =").append(HexDump.byteToHex(getGrbit2())).append("\n");
    buffer.append(" .citmShow =").append(HexDump.shortToHex(getCitmShow())).append("\n");
    buffer.append(" .isxdiSort =").append(HexDump.shortToHex(getIsxdiSort())).append("\n");
    buffer.append(" .isxdiShow =").append(HexDump.shortToHex(getIsxdiShow())).append("\n");
    buffer.append(" .subName =").append(getSubName()).append("\n");
    buffer.append("[/SXVDEX]\n");
    return buffer.toString();
}
}