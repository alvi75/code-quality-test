import java.util.*;

public class Translation233 {
    public AnyQuery build(QueryNode queryNode) throws QueryNodeException {
    AnyQueryNode andNode = (AnyQueryNode) queryNode;
    BooleanQuery.Builder bQuery = new BooleanQuery.Builder();
    List<QueryNode> children = andNode.getChildren();
    if (children != null) {
        for (QueryNode child : children) {
            Object obj = child.getTag(QueryTreeBuilder.QUERY_TREE_BUILDER_TAGID);
            if (obj != null) {
                Query query = (Query) obj;
                try {
                    bQuery.add(query, Occur.SHOULD);
                }
                catch (BooleanQuery.TooManyClauses ex) {
                    throw new QueryNodeException(new MessageImpl(QueryParserMessages.EMPTY_MESSAGE),ex);
                }
            }
        }
    }
    bQuery.setMinimumNumberShouldMatch = andNode.getMinimumMatchingElements();
    return bQuery.build();
}
}