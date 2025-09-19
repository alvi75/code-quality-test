import java.util.*;

public class Translation233 {
    public Query build(QueryNode queryNode) throws QueryNodeException {
    if (!(queryNode instanceof BooleanQueryNode)) {
        throw new QueryNodeException(new MessageImpl(QueryParserMessages.NODE_TYPE_ERROR, queryNode.getClass().getName(), BooleanQueryNode.class.getName()));
    }
    BooleanQueryNode booleanNode = (BooleanQueryNode) queryNode;
    BooleanQuery.Builder bQuery = new BooleanQuery.Builder();
    List<QueryNode> children = booleanNode.getChildren();
    if (children != null) {
        for (QueryNode child : children) {
            Object obj = child.getTag(QueryTreeBuilder.QUERY_TREE_BUILDER_TAGID);
            if (obj != null) {
                Query query = (Query) obj;
                try {
                    bQuery.add(query, getOccur(child));
                }
                catch (TooManyClauses ex) {
                    throw new QueryNodeException(new MessageImpl(QueryParserMessages.TOO_MANY_BOOLEAN_CLAUSES, IndexSearcher.getMaxClauseCount(), queryNode.toQueryString(new EscapeQuerySyntaxImpl())), ex);
                }
            }
        }
    }
    bQuery.setMinimumNumberShouldMatch = booleanNode.getMinimumMatchingElements();
    return bQuery.build();
}
}