import java.util.*;

public class Translation764 {
    public GroupQueryNode(QueryNode query) {
    if (query == null) {
        throw new QueryNodeError(Message.parse(Message.PARAMETER_VALUE_NOT_SUPPORTED, "query", "null"));
    }
    allocate();
    isLeaf = false;
    add(query);
}
}