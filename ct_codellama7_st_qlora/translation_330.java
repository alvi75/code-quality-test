import java.util.*;

public class Translation330 {
    public ParseTreeMatch match(ParseTree tree, ParseTreePattern pattern) {
    MultiMap<String, ParseTree> labels = new MultiMap<>();
    ParseTree mismatchedNode = matchImpl(tree, pattern.getPatternTree(), labels);
    return new ParseTreeMatch(tree, pattern, labels, mismatchedNode);
}
}