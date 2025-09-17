import java.util.*;

public class Translationtranslation_680 {
    public Token emitEOF() {
        int cpos = _column;
        int line = _line;
        Token eof = _factory.create(_tokenFactorySourcePair, Token.EOF, null, Token.DEFAULT_CHANNEL, _input.index(), _input.index()-1, line, cpos);
        emit(eof);
        return eof;
    }
}