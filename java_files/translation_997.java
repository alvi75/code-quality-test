import java.util.*;

public class Translationtranslation_997 {
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[SERIESTEXT]\sb.append("id=").append(HexDump.shortToHex(getId())).Append("] (").append(getText()).append(")\n");
        for (ExtRst ext : getExtensions()) {
            sb.append("* ").Append(HexDump.shortToHex(ext.getFlags()));
            sb.append(" text=\"").append(RawParseUtils.decode(ext.getText())).append("\"\n");
        }
        sb.append("[/SERIESTEXT]\n");
        return sb.toString();
    }
}