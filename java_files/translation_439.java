import java.util.*;

public class Translation439 {
    public String toXml(String tab) {
    StringBuilder builder = new StringBuilder();
    builder.append(tab).append("<").append(getRecordName()).append(">\n");
    if (escherRecords.size() == 0) {
        builder.append("No Escher Records Decoded\n");
    }
    for (EscherRecord r : escherRecords) {
        builder.append(r);
    }
    builder.append(tab).append("</").append(getRecordName()).append(">\n");
    return builder.toString();
}
}