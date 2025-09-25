import java.util.*;

public class Translation371 {
    public String toString() {
    if (getChildren() == null || getChildren().size() == 0)return "<boolean operation='and'/>";
    StringBuilder sb = new StringBuilder();
    sb.append("<boolean operation='and'>");
    for (Iterator<QueryNode> i = getChildren().iterator();
    i.hasNext();
    ) {
        QueryNode child = i.next();
        sb.append("\n");
        sb.append(child.toString());
        if (i.hasNext())sb.append("\n");
    }
    sb.append("\n</boolean>");
    return sb.toString();
}
}