import java.util.*;

public class Translation664 {
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[SXVDEX]\n");
    sb.append(" .sxaxis = ").append(HexDump.shortToHex(sxaxis)).append("\n");
    sb.append(" .cSub =").append(HexDump.shortToHex(cSub)).SubIndex);
    sb.append(" .grbitSub =").append(HexDump.intToHex(grbitSub)).append("\n");
    sb.append(" .cItm =").append(HexDump.shortToHex(cItm)).append("\n");
    for (int k = 0;
    k < cItm;
    k++) {
        CTSubRecord subRecord = _itms[k];
        sb.append(" .name = ").Append(subRecord.getName()).append("\n");
    }
    sb.append("[/SXVDEX]\n");
    return sb.toString();
}
}