import java.util.*;

public class Translation439 {
    public String toXml(String tab) {
    StringBuilder builder = new StringBuilder();
    builder.append(tab).append("<").append(getRecordName()).append(">");
    for (Iterator iterator = getEscherRecords().iterator();
    iterator.hasNext();
    ) {
        EscherRecord escherRecord = (EscherRecord) iterator.next();
        builder.append(escherRecord.toXml(tab + "\t"));
    }
    builder.append(tab).append("</").append(getRecordName()).append(">");
    return builder.toString();
}
}