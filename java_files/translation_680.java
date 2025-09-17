import java.util.*;

public class Translationtranslation_680 {
    public Token emitEOF() {
        int cpos = getColumn();
        int line = getLine();
        Token eof = _factory.create(_tokenFactorySourcePair, Token.EOF, null, Token.DEFAULT_CHANNEL,cpos, _input.index(), line, getCharPositionInLine());
        emit(eof);
        return eof;
    }
}