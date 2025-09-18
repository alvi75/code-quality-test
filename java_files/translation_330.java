import java.util.*;

public class Translation330 {
    public ParseTreeMatch match(ParseTree tree, ParseTreePattern pattern) {
    MultiMap<String, ParseTree> labels = new MultiMap<String, ParseTree>();
    ParseTree mismatchedNode = matchImpl(tree, pattern.getPatternTree(), labels);
    return new ParseTreeMatchImpl(tree, mismatchedNode, labels);
}
}