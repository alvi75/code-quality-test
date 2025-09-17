import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class Translationtranslation_330 {
    public ParseTreeMatch match(ParseTree tree, ParseTreePattern pattern) {
        MultiMap<String, ParseTree> labels = new MultiMap<String, ParseTree>();
        ParseTree mismatchedNode = matchImpl(tree, pattern.getPatternTree(), labels);
        return new ParseTreeMatch(tree, pattern, labels, mismatchedNode);
    }
}