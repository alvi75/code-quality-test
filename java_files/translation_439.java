import java.util.*;

public class Translation439 {
    public String toXML(final String tab) {
    final StringBuilder buffer = new StringBuilder();
    buffer.append("\n");
    buffer.append(" [TABID]\n");
    for (int i = 0;
    i < _tabids.length;
    i++) {
        buffer.append(" .row = ").append(_tabids[i]).append("\n");
    }
    buffer.append("[/TABID]\n");
    return buffer.append(buffer.toString();
}
}