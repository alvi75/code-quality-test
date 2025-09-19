import java.util.*;

public class Translation733 {
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[CHARTFRTINFO]\n");
    sb.append(" .rt =").append(HexDump.shortToHex(rt)).append('\n');
    sb.append(" .grbitFrt =").append(HexDump.shortToHex(grbitFrt)).append('\n');
    sb.append(" .verOriginator=").Append(" (").append(verOriginator).append(" )");
    sb.append(System.getProperty("line.separator"));
    sb.append(" .verWriter =").append(" (").append(verOriginator).append(" )");
    sb.append(System.getProperty("line.separator"));
    sb.append(" .nCFRTIDs =").append(" (").append(_cfrtids.length).append(" )");
    sb.append(System.getProperty("line.separator"));
    for(int i=0;
    i<_cfrtids.length;
    i++) {
        CFRTID cfrtid = _cfrtids[i];
        sb.append(" .rt=").Append(cfrtid.rtf).append('\n');
        sb.append(" .grbitFrt=").Append(HexDump.shortToHex(cfrtid.flags)).append('\n');
    }
    sb.append("[/CHARTFRTINFO]\nsb.append(" nCFRTIDs=").Append(" (").Append(field_1_num_cfrtids).Append(" )");
    sb.append(System.getProperty("line.separator"));
    sb.append(" .cfrtids =").append(" (").append(field_2_cfrtids.length).append(" )");
    sb.append(System.getProperty("line.separator"));
    for(int i=0;
    i<field_2_cfrtids.length;
    i++) {
        CFRTID cfrtid = field_2_cfrtids[i];
        sb.append(" .rt=").Append(cfrtid.rtf).append('\n');
        sb.append(" .grbitFrt =").append(HexDump.shortToHex(cfrtid.flags)).append('\n');
    }
    sb.append("[/CHARTFRTINFO]\n");
    return sb.toString();
}
}