import java.util.*;

public class Translation680 {
    public Token emitEOF() {
    int cpos = getCharPositionInLine();
    int line = getLine();
    Token eof = _factory.create(cpos, line, Token.EOF, getCharCount(), getInputStream());
    emit(eof);
    return eof;
}
}