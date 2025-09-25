import java.util.*;

public class Translation439 {
    public String toXML(String tab) {
    StringBuilder builder = new StringBuilder();
    builder.append(tab).append("<").append(getRecordName()).append(">\n");
    for (Iterator iterator = getEscherRecords().iterator();
    iterator.hasNext();
    ) {
        EscherRecord escherRecord = (EscherRecord)iterator.next();
        builder.append(escherRecord.toXML(tab + "\t"));
    }
    builder.append(tab).append("</").append(getRecordName()).append(">\n");
    return builder.toString();
}
}