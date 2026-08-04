import java.util.*;

public class Translation680 {
    public Token emitEOF() {
    int cpos = getCharPositionInLine();
    int line = getLine();
    Token eof = _factory.create(Token.EOF, null, Token.DEFAULT_CHANNEL, getCharPositionInLine(), getCharIndex()-1, getLine(), cpos);
    emit(eof);
    return eof;
}
}