import java.util.*;

public class Translation439 {
    public String toXml(String tab) {
    StringBuilder buffer = new StringBuilder();
    buffer.append(tab).append("<").append(getRecordName()).append(">\n");
    for (Iterator it = getEscherRecords().iterator();
    it.hasNext();
    ) {
        EscherRecord escherRecord = (EscherRecord)it.next();
        buffer.append(escherRecord.toXml(tab + "\t"));
    }
    buffer.append(tab).append("</").append(getRecordName()).append(">\n");
    return buffer.toString();
}
}