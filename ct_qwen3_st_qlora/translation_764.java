import java.util.*;

public class Translation764 {
    ublic GroupQueryNode(QueryNode query) {
    if (query == null) {
        throw new QueryNodeException(new MessageImpl(QueryParserMessages.PARAMETER_VALUE_NOT_SUPPORTED, "query", "null"));
    }
    allocate();
    setLeaf(false);
    add(query);
}
}