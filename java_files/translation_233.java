import java.util.*;

public class Translation233 {
    public Query build(QueryNode queryNode) {
    AnyQueryNode andNode = (AnyQueryNode) queryNode;
    BooleanQuery bQuery = new BooleanQuery();
    List<QueryNode> children = andNode.getChildren();
    if (children != null) {
        for (QueryNode child : children) {
            Object obj = child.getTag(QueryTreeBuilder.QUERY_TREE_BUILDER_TAGID);
            if (obj != null) {
                Query query = (Query) obj;
                bQuery.add(query, Occur.SHOULD);
            }
        }
    }
    bQuery.setMinimumNumberShouldMatch(andNode.getMinimumMatchingElements());
    return bQuery;
}
}