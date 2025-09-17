import java.util.*;

public class Translationtranslation_439 {
    public String toXml(String tab) {
        StringBuilder builder = new StringBuilder();
        builder.append(tab).append("<").append(getRecordName()).append(">\n");
        for (EscherRecord escherRecord : getEscherRecords()) {
            builder.append(escherRecord);
        }
        builder.append(tab).append("</").append(getRecordName()).append(">\n");
        return builder.toString();
    }
}