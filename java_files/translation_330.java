import java.util.*;

public class Translation330 {
    public ParseTreeMatch match(ParseTree tree, ParseTreePattern pattern) {
    final Map<String, ParseTree> labels = new HashMap<>();
    ParseTree mismatchedNode = matchImpl(tree, pattern.patternTree(), labels);
    return new ParseTreeMatch(tree, pattern, labels, mismatchedNode);
}
}