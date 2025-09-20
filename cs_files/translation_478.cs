using System;
using System.Collections.Generic;

public class Translation478
{
    public ParseException(Token currentTokenVal,int[][] expectedTokenSequencesVal, string[] tokenImageVal): base(new Message(QueryParserMessages.INVALID_SYNTAX, Initialize(currentTokenVal, expectedTokenSequencesVal, tokenImageVal))){
    this.CurrentToken = currentTokenVal;
    this.ExpectedTokenSequences = expectedTokenSequencesVal;
    this.TokenImage = tokenImageVal;
}
}