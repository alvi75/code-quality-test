import java.util.*;

public class Translation334 {
    public Collection<ParseTree> evaluate(ParseTree t) {
    Collection<ParseTree> nodes = new LinkedList<>();
    for (int i=0;
    i < ruleIndex;
    i++) {
        nodes.addAll(Trees.findAllRuleNodes(t, i));
    }
    nodes.addAll(evaluate0(t));
    return nodes;
}
}