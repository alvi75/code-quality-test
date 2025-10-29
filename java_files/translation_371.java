import java.util.*;

public class Translation371 {
    public String toString() {
    final Iterator<QueryNode> it = getChildren().iterator();
    StringBuilder sb = new StringBuilder();
    sb.append("<boolean operation=\"and\">");
    while (it.hasNext()) {
        QueryNode node = it.next();
        sb.append("\n");
        sb.append(node.toString());
    }
    sb.append("\n</boolean>");
    return sb.toString();
}
}