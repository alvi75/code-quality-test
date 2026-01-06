import java.util.*;

public class Translation371 {
    public String toString() {
    List<QueryNode> children = getChildren();
    if (children == null || children.size() == 0) return "<boolean operation='and'/>";
    StringBuilder sb = new StringBuilder();
    sb.append("<boolean operation='and'>\n");
    for (QueryNode child : children) {
        sb.append(child.toString()).append("\n");
    }
    sb.append("</boolean>\n");
    return sb.toString();
}
}