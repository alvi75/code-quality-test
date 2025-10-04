import java.util.*;

public class Translation664 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[SXVDEX]\n");
    buffer.append(" .sxaxis = ").append(HexDump.shortToHex(_sxaxis)).append('\n');
    buffer.append(" .cSub = ").append(HexDump.shortToHex(_cSub)).append('\n');
    buffer.append(" .grbitSub = ").append(HexDump.shortToHex(_grbitSub)).append('\n');
    buffer.append(" .cItm = ").append(HexDump.shortToHex(_cItm)).append('\n');
    buffer.append(" .name = ").append(_name).append('\n');
    buffer.append("[/SXVDEX]\n");
    return buffer.toString();
}
}