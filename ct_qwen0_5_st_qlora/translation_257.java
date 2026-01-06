import java.util.*;

public class Translation257 {
    public QueryNode create(QueryNode input) {
    if (input instanceof FieldQueryNode) {
        FieldQueryNode fieldQueryNode = (FieldQueryNode) input;
        return new CommonGramsQueryNode(fieldQueryNode.getTerm(), fieldQueryNode.getBoost());
    }
    else if (input instanceof TermQueryNode) {
        TermQueryNode termQueryNode = (TermQueryNode) input;
        return new CommonGramsQueryNode(termQueryNode.getTerm(), termQueryNode.getBoost());
    }
    else {
        throw new IllegalArgumentException("Unknown input type " + input.getClass().getName());
    }
}
}