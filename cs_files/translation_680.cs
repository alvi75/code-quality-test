using System;
using System.Collections.Generic;

public class Translation680
{
    public virtual IToken EmitEOF(){
    int cpos = CharPositionInLine;
    int line = LineNumber;
    IToken eof = _factory.Create(cpos, line, TokenConstants.EOF, TokenConstants.DefaultChannel, _input.Index, _input.Line, cpos);
    Mopen(eof);
    return eof;
}
}