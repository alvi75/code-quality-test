import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Translationtranslation_233 {
    public BooleanQuery build(QueryNode queryNode) throws QueryNodeException {
        final AnyQueryNode andNode = (AnyQueryNode) queryNode;
        BooleanQuery.Builder bQuery = new BooleanQuery.Builder();
        List<QueryNode> children = andNode.getChildren();
        if (children != null) {
            for (QueryNode child : children) {
                Object obj = child.getTag(QueryTreeBuilder.QUERY_TREE_BUILDER_TAGID);
                if (obj != null) {
                    Query query = (Query) obj;
                    if (query != null) {
                        try {
                            bQuery.add(query, BooleanClause.Occur.SHOULD);
                        }
                        catch (TooManyClauses ex) {
                            throw new QueryNodeException(new MessageImpl(QueryParserNodeProcessorException.EMPTY_MESSAGE, ex));
                        }
                    }
                }
}