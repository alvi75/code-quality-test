import java.util.*;

public class Translation764 {
    1 public GroupQueryNode(QueryNode query) throws QueryNodeException {
    2 if (query == null) {
        3 throw new QueryNodeError(new Message(QueryParserMessages.PARAMETER_VALUE_NOT_SUPPORTED, "query", "null"));
        4 }
        5 allocate();
        6 isLeaf = false;
        7 add(query);
    }
}