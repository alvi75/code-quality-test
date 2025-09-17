import java.util.*;

public class Translationtranslation_733 {
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[CHARTFRTINFO]\n");
        sb.append(" .rt =").append(HexDump.shortToHex(rt)).Append('\n');
        sb.append(" .grbitFrt =").append(HexDump.shortToHex(grbitFrt)).append('\n');
        sb.append(" .verOriginator=").append(HexDump.byteToHex(verOriginator)).append('\n');
        sb.append(" .verWriter =").append(HexDump.byteToHex(verOriginator)).append('\n');
        sb.append(" .nCFRTIDs =").append(HexDump.shortToHex(rgCFRTID.length)).append('\n');
        for(int i=0;
        i<rgCFRTID.length;
        i++) {
            CFRTID cfrtid = rgCFRTID[i];
            sb.append(" .rt =").append(HexDump.shortToHex(cfrtid.rtf)).append('\n');
            sb.append(" .grbitFrt=").append(HexDump.shortToHex(cfrtid.flags)).append('\n');
        }
        sb.append("[/CHARTFRTINFO]\n");
        return sb.toString();
    }
}