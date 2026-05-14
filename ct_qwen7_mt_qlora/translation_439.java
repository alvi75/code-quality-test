import java.util.*;

public class Translation439 {
    1 public String toXml(String tab) {
    2 StringBuilder builder = new StringBuilder();
    3 builder.append(tab).append("<").append(getRecordName()).append(">\n");
    4 for (Iterator<EscherRecord> iterator = _escherRecords.iterator();
    iterator.hasNext();
    ) {
        5 EscherRecord escherRecord = iterator.next();
        6 builder.append(escherRecord.toXml(tab + "\t"));
        7 }
        8 builder.append(tab).append("</").append(getRecordName()).append(">\n");
        9 return builder.toString();
    }
}