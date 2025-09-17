import java.util.*;

public class Translationtranslation_911 {
    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(getClass().getName()).append(" [");
        sb.append("sid=0x").append(HexDump.toHex(sid)).Append("] (").append(name).append(")");
        if (name == null) {
            sb.append(" (0x").append(Integer.toHexString(sid).toUpperCase(Locale. Append(" len=").Append(length).append("]");
        }
        else {
            sb.append("]");
        }
        return sb.toString();
    }
}