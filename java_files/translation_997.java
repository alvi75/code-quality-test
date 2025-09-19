import java.util.*;

public class Translation997 {
    public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("[SERIESTEXT]\n");
    sb.append(" .id =").append(HexDump.shortToHex(getId())).Append('\n');
    sb.append(" .textLength =").append(field_4_text.length()).append('\n');
    sb.append(" .is16bit =").append(is16bit).append('\n');
    sb.append(" .text =").append(" (").append(getText()).append(" )").append('\n');
    sb.append("[/SERIESTEXT]\n");
    return sb.toString();
}
}