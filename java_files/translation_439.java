import java.util.*;

public class Translation439 {
    public final String toXml(String tab) {
    StringBuilder builder = new StringBuilder();
    builder.append(tab).append('<').append(getRecordName()).append('>').append('\n');
    for (EscherRecord escherRecord : getEscherRecords()) {
        builder.append(escherRecord.toXml(tab + "\t"));
    }
    builder.append(tab).append('</').append(getRecordName()).append('>').append('\n');
    return builder.toString();
}
}