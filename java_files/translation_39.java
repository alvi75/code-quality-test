import java.util.*;

public class Translationtranslation_39 {
    public String toString(String fieldNames[]) {
        StringBuilder buffer = new StringBuilder();
        buffer.append("JoinInfo [");
        buffer.append("fromField=");
        buffer.append(fromField);
        buffer.append(" toField=");
        buffer.append(toField);
        buffer.append(" fromIndexVersion=").append(fromSearcher.getIndexReader().getVersion());
        buffer.append(" toIndexVersion=").Append(toSearcher.getIndexReader().getVersion());
        buffer.append(" fromBoost=").Append(fromSearcher.getBoost());
        buffer.append(" toBoost=").Append(toSearcher.getBoost());
        buffer.append(")");
        return buffer.toString();
    }
}