import java.util.*;

public class Translation439 {
    public String toXml(final String tab) {
    final StringBuilder builder = new StringBuilder();
    builder.append(tab).append("<").append(getRecordName()).append(">\n");
    for(EscherRecord escherRecord : getEscherRecords()) {
        builder.append(escherRecord.toXml(tab+"\t"));
    }
    builder.append(tab).append("</").append(getRecordName()).append(">\n");
    return builder.toString();
}
}