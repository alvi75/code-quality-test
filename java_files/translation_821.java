import java.util.*;

public class Translationtranslation_821 {
    public String toString() {
        final StringBuilder buffer = new StringBuilder();
        buffer.append("[PROT4REV]\n");
        buffer.append(" .options) = ").append(HexDump.shortToHex(getProtect())).append("\n");
        buffer.append("[/PROT4REV]\n");
        return buffer.toString();
    }
}