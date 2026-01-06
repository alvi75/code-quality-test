import java.util.*;

public class Translation439 {
    public String toXml(String tab) {
    StringBuilder sb = new StringBuilder();
    sb.append(tab).append("<").append(getRecordName()).append(">");
    for (EscherRecord r : getEscherRecords()) {
        sb.append(r.toXml(tab + "\t"));
    }
    sb.append(tab).append("</").append(getRecordName()).append(">");
    return sb.toString();
}
}