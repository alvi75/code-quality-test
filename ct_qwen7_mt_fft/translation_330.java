import java.util.*;

public class Translation330 {
    public ParseTreeMatch match(ParseTree tree, ParseTreePattern pattern) {
    Multimap<String, ParseTree> labels = HashMultimap.create();
    ParseTree mismatchedNode = matchImpl(tree, pattern.getPatternTree(), labels);
    return new ParseTreeMatch(tree,pattern,labels,mismatchedNode);
}
}