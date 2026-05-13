import java.util.*;

public class Translation330 {
    public ParseTreeMatch match(ParseTree tree, String patternRuleName) {
    ParseTreePattern p = compile(patternRuleName, tree.getParser());
    return match(tree, p);
}
}