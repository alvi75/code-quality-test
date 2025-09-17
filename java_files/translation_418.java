import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Translationtranslation_418 {
    public String toString() {
        final StringBuilder b = new StringBuilder();
        b.append("[DCONREF]\b");
        b.append(" .range = ").append(getRange()).append("\n");
        b.append(" .cchDefListStyle= ").Append(field_5_cbo_id).append("\n");
        b.append(" .unused =").append(HexDump.toHex(_reserved)).append("\n");
        b.append("[/DCONREF]\b");
        return b.toString();
    }
}