import java.util.*;

public class Translation439 {
    public String toXml(String tab) {
    StringBuilder buffer = new StringBuilder();
    buffer.append(tab).append("<").append(getRecordName()).append(">\n");
    for (Iterator<EscherRecord> iterator = getEscherRecords().iterator();
    iterator.hasNext();
    ) {
        EscherRecord escherRecord = iterator.next();
        buffer.append(escherRecord.toXml(tab + "\t"));
    }
    buffer.append(tab).append("</").append(getRecordName()).append(">\n");
    return buffer.toString();
}
}