import java.util.*;

public class Translation330 {
    public ParseTreeMatch match(ParseTree tree, ParseTreePattern pattern) {
    final Map<String, List<ParseTree>> labels = new HashMap<>();
    match(tree, pattern.patternTree(), labels);
    return new ParseTreeMatch(tree, pattern, labels, null);
}
}