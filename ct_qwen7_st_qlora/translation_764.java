import java.util.*;

public class Translation764 {
    public GroupQueryNode(QueryNode query) throws QueryNodeError {
    if (query==null) {
        throw new QueryNodeError(new MessageImpl(QueryParserMessages.PARAMETER_VALUE_NOT_SUPPORTED,"query","null"));
    }
    allocate();
    setLeaf(false);
    add(query);
}
}