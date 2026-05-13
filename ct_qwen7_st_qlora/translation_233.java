import java.util.*;

public class Translation233 {
    public Query build(QueryNode queryNode) throws QueryNodeException {
    if (!(queryNode instanceof AnyQueryNode)) {
        throw new QueryNodeException(new MessageImpl(QueryParserMessages.NODE_NOT_SUPPORTED, queryNode));
    }
    final List<QueryNode> children = queryNode.getChildren();
    if (null == children || children.isEmpty()) {
        return null;
    }
    BooleanQuery.Builder bq = new BooleanQuery.Builder();
    for (QueryNode child : children) {
        Object obj = child.getTag(QueryTreeBuilder.QUERY_TREE_BUILDER_TAGID);
        if (null != obj && obj instanceof Query) {
            bq.add((Query) obj, Occur.SHOULD);
        }
        else {
            Query c = build(child);
            if (null != c) {
                bq.add(c, Occur.SHOULD);
            }
        }
    }
    return bq.build();
}
}