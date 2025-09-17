import java.util.*;

public class Translationtranslation_979 {
    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("[BLANK]");
        sb.append(" row=").append(HexDump.shortToHex(getRow())).append(" col=").append(HexDump.shortToHex(getColumn()));
        sb.append(" xf=").append(HexDump.shortToHex(getXFIndex()));
        sb.append("[/BLANK]");
        return sb.toString();
    }
}