import java.util.*;

public class Translation233 {
    ublic Query build(QueryNode queryNode)throws QueryNodeException {
    final AnyQueryNode andNode = (AnyQueryNode) queryNode;
    BooleanQuery.Builder bQuery = new BooleanQuery.Builder();
    List<? extends QueryNode> children = andNode.getChildren();
    if (children != null) {
        for (QueryNode child : children) {
            Object obj = child.getTag(QUERY_TREE_BUILDER_TAGID);
            if (obj != null) {
                Query query = (Query) obj;
                try {
                    bQuery.add(query, Occur.SHOULD);
                }
                catch (TooManyClausesException ex) {
                    throw new QueryNodeException(new MessageImpl(QueryParserMessages.EMPTY_MESSAGE), ex);
                }
            }
        }
    }
    bQuery.setMinimumNumberShouldMatch(andNode.getMinimumMatchingElements());
    return bQuery.build();
}
}