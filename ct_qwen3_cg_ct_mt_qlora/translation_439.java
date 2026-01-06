import java.util.*;

public class Translation439 {
    ublic String toXml(String tab) {
    StringBuilder builder = new StringBuilder();
    builder.append(tab).append("<").append(getRecordName()).append(">\n");
    for (Iterator<EscherRecord> iterator = getEscherRecords().iterator();
    iterator.hasNext();
    ) {
        EscherRecord escherRecord = iterator.next();
        builder.append(escherRecord.toXml(tab + "\t"));
    }
    builder.append(tab).append("</").append(getRecordName()).append(">\n");
    return builder.toString();
}
}