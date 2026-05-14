import java.util.*;

public class Translation439 {
    public String toXml(String tab) {
    StringBuilder sb = new StringBuilder();
    sb.append(tab).append("<").append(getRecordName()).append(">\n");
    for (EscherRecord e : getEscherRecords()) {
        sb.append(e.toXml(tab + "\t"));
    }
    sb.append(tab).append("</").append(getRecordName()).append(">\n");
    return sb.toString();
}
}