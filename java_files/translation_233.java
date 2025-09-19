import java.util.*;

public class Translation233 {
    public BooleanQuery build(QueryNode queryNode) throws QueryNodeException {
    final BooleanQueryNode booleanNode = (BooleanQueryNode) queryNode;
    BooleanQuery.Builder bQuery = new BooleanQuery.Builder();
    List<QueryNode> children = booleanNode.getChildren();
    if (children != null) {
        for (QueryNode child : children) {
            Object obj = child.getTag(QueryTreeQueryTreeBuilder.QUERY_TREE_BUILDER_TAGID);
            if (obj != null) {
                Query query = (Query) obj;
                if (query != null && (!(query instanceof BooleanQuery)) {
                    try {
                        bQuery.add(query, BooleanClause.Occur.SHOULD);
                    }
                    QueryNodeError(MessageImpl.create("boolean operator missing"));
                    QueryNodeError message = new QueryNodeErrorImpl(JGitText.get().missingBooleanOperator);
                    throw new QueryNodeException(message);
                }
            }
}