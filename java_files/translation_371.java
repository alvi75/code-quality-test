import java.util.*;

public class Translation371 {
    public String toString() {
    List<IQueryNode> children = getChildren();
    if (children == null || children.size() == 0) return "<boolean operation='and'/>";
    StringBuilder sb = new StringBuilder();
    sb.append("<boolean operation='and'>");
    for (IQueryNode child : children) {
        sb.append("\n");
        sb.append(child.toString());
    }
    sb.append("\n</boolean>");
    return sb.toString();
}
}