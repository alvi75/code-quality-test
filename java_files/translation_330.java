import java.util.*;

public class Translation330 {
    public ParseTreeMatch match(ParseTree tree, String pattern) {
    MultiMap<String, ParseTree> labels = new MultiMap<String, ParseTree>();
    ParseTree mismatchedNode = matchImpl(tree, getPatternNodeMatcher().parse(pattern), labels);
    return new ParseTreeMatch(tree, labels, mismatchedNode);
}
}