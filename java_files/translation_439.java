import java.util.*;

public class Translation439 {
    public String toXml(String tab) {
    StringBuilder builder = new StringBuilder();
    builder.append(tab).append("<").append(getRecordName()).append(">\n");
    for (Iterator<EscherRecord> it = getEscherRecords().iterator();
    it.hasNext();
    ) {
        EscherRecord escherRecord = it.next();
        builder.append(escherRecord.toXml(tab + "\t"));
    }
    builder.append(tab).append("</").append(getRecordName()).append(">\n");
    return builder.toString();
}
}