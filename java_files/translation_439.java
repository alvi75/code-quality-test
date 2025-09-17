import java.util.*;

public class Translationtranslation_439 {
    public String toXML(final String tab) {
        final StringBuilder buffer = new StringBuilder();
        buffer.append("\n");
        buffer.append("[TABID]\n");
        buffer.append(" .elements = ").Append(_tabids.length).Append("\n");
        for (int i = 0;
        i < _tabids.length;
        i++) {
            buffer.append(" .element_").append(i).append(" = ").append(_tabids[i]).append("\n");
        }
        buffer.append("[/TABID]\_").append(getRecordName()).append("]\
}