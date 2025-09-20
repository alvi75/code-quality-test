using System;
using System.Collections.Generic;

public class Translation447
{
    public virtual string GetErrorHeader(RecognitionException e){
    int line = e.CurrentToken.Line;
    int charPositionInLine = e.CurrentToken.Column;
    return "line " + line + ", column " + charPositionInLine;
}
}