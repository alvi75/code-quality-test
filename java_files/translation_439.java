import java.util.*;

public class Translation439 {
    public final String toXML(String tab) {
    StringBuilder buffer = new StringBuilder();
    buffer.append("\n");
    buffer.append(tab).append("<").append(getRecordName()).append(">\n");
    for (EscherRecord r : getEscherRecords()) {
        buffer.append(r.toXML(tab + "\t"));
    }
    buffer.append(tab).append("</").append(getRecordName()).append(">\n");
    return buffer.toString();
}
}