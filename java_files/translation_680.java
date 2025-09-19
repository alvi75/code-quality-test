import java.util.*;

public class Translation680 {
    public Token EOF() {
    int cpos = getCharPositionInLine();
    int line = getLineNumber();
    Token eof = _factory.create(_eofTokenPair, Token.EOF, null, Token.DEFAULT_CHANNEL, _input.index(), _input.index()-1,line, cpos);
    emit(eof);
    return eof;
}
}