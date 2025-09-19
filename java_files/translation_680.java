import java.util.*;

public class Translation680 {
    public Token emitEOF() {
    int cpos = _input.index();
    int line = _line;
    int charPositionInLine = _charPositionInLine;
    String text = _text.toString();
    if ( text.length() == 0 && charPositionInLine == 0 ) {
        return null;
    }
    if ( charPositionInLine == 0 ) {
        --line;
    }
    Token eof = _factory.create(_tokenFactorySourcePair, Token.EOF, text, _channel, line, cpos, cpos);
    emit(eof);
    return eof;
}
}