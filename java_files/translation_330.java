import java.util.*;

public class Translation330 {
    ublic ParseTreeMatch match(ParseTree tree, ParseTreePattern pattern) {
    MultiMap<String, ParseTree> labels = new MultiMap<>();
    ParseTree mismatchedNode = matchImpl(tree, pattern.patternTree, labels);
    return new ParseTreeMatch(tree, pattern, labels, mismatchedNode);
}
}