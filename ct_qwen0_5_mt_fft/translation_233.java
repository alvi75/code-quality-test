import java.util.*;

public class Translation233 {
    public Query build(QueryNode queryNode) throws ParseException {
    AnyQueryNode andNode = (AnyQueryNode) queryNode;
    BooleanQuery bQuery = new BooleanQuery();
    List<Query> children = andNode.getChildren();
    if (children != null) {
        for (Query child : children) {
            Object obj = child.getTag(QueryBuilder.QUERY_TREE_BUILDER_TAGID);
            if (obj != null) {
                Query query = (Query)obj;
                try {
                    bQuery.add(query, Occur.SHOULD);
                }
                catch (BooleanQuery.TooManyClausesException ex) {
                    throw new QueryNodeException(new Message(QueryParserMessages.EMPTY_MESSAGE), ex);
                }
            }
        }
    }
    bQuery.setMinimumNumberShouldMatch(andNode.getMinimumMatchingElements());
    return bQuery;
}
}