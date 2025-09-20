using System;
using System.Collections.Generic;

public class Translation432
{
    public virtual ParseTreePattern CompileParseTreePattern(string pattern, int patternRuleIndex){
    if (TokenSource != null){
        TokenSource tokenSource = TokenSource;
        return CompileParseTreePattern(pattern, patternRuleIndex, tokenSource);
    }
    else{
        throw new NotSupportedException("Parser can't discover a lexer to use");
    }
}
}