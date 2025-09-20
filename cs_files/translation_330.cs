using System;
using System.Collections.Generic;

public class Translation330
{
    public virtual ParseTreeMatch Match(IParseTree tree, ParseTreePattern pattern){
    MultiMap<string, IParseTree> labels = new MultiMap<string, IParseTree>();
    IParseTree mismatchedNode = MatchImpl(tree, pattern.PatternTree, labels);
    if (mismatchedNode != null){
        return new ParseTreeMatch.Unmatched(tree, mismatchedNode);
    }
    #if (NET45PLUS && !DOTNETCORE)return ParseTreeMatch.Match(tree, pattern.PatternTree, labels);
    #elsereturn new ParseTreeMatch.FoundMatch(tree, pattern, labels, mismatchedNode);
}
else{
    #endifthrow new NotSupportedException("this matcher doesn't support the pattern '" + pattern.Pattern + "'");
}
}