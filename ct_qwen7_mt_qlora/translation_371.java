import java.util.*;

public class Translation371 {
    1 public String toString() {
    2 final List<IQueryNode> children = getChildren();
    3 if (children == null || children.isEmpty())4 return "<boolean operation='and'/>";
    5 final StringBuilder sb = new StringBuilder();
    6 sb.append("<boolean operation='and'>");
    7 for (final IQueryNode child : children)8 {
        9 sb.append("\n");
        10 sb.append(child.toString());
        11 }
        12 sb.append("\n</boolean>");
        13 return sb.toString();
    }
}