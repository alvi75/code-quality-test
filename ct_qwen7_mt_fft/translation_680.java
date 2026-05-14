import java.util.*;

public class Translation680 {
    public Token emitEOF() {
    final int cpos = getCharPositionInLine();
    final int line = getLine();
    final Token eof = _factory.create(_tokenFactorySourcePair, Token.EOF, null, getDefaultChannel(), _input.index(), _input.index()-1,line,cpos);
    emit(eof);
    return eof;
}
}