import java.util.*;

public class Translation371 {
    public String toString() {
    final List<IQueryNode> children = getChildren();
    if (children == null || children.size() == 0) return "<boolean operation='and'/>";
    final StringBuilder sb = new StringBuilder();
    sb.append("<boolean operation='and'>\n");
    for (final IQueryNode child : children) {
        sb.append("\n");
        sb.append(child.toString());
    }
    sb.append("\n</boolean>");
    return sb.toString();
}
}