import java.util.*;

public class Translation233 {
    public Query build(QueryNode queryNode) throws QueryNodeException {
    AnyQueryNode andNode = (AnyQueryNode) queryNode;
    BooleanQuery bQuery = new BooleanQuery();
    List<QueryNode> children = andNode.getChildren();
    if (children != null) {
        for (QueryNode child : children) {
            Object obj = child.getTag(QueryTreeBuilder.QUERY_TREE_BUILDER_TAGID);
            if (obj != null) {
                Query query = (Query) obj;
                try {
                    bQuery.add(query, BooleanClause.Occur.SHOULD);
                }
                catch (TooManyClauses ex) {
                    throw new QueryNodeException(new Message(QueryParserMessages.EMPTY_MESSAGE), ex);
                }
            }
        }
    }
    bQuery.setMinimumNumberShouldMatch(andNode.getMinimumMatchingElements());
    return bQuery;
}
}