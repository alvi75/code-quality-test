import java.util.*;

public class Translation439 {
    1 public String toXml(String tab) {
    StringBuilder builder = new StringBuilder();
    builder.append(tab).append("<").append(getRecordName()).append(">\n");
    for (EscherRecord escherRecord : escherRecords) {
        builder.append(escherRecord.toXml(tab + "\t"));
    }
    builder.append(tab).append("</").append(getRecordName()).append(">\n");
    return builder.toString();
}
}