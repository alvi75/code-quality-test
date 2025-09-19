import java.util.*;

public class Translation195 {
    public QueryConfig(AllGroupQueryNode queryNode) {
    super(queryNode);
    if (!queryNode.isLeaf()) {
        throw new IllegalArgumentException("AllGroupQueryNode should be a leaf node");
    }
}
}