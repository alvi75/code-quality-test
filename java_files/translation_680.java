import java.util.*;

public class Translation680 {
    public Token emitEOF() {
    int cpos = getColumn();
    int line = getLine();
    Token eof = createToken(_tokenFactorySourcePair, TokenConstants.EOF, null, TokenConstants.DEFAULT_CHANNEL, _input.index(), _input.index()-1, line, cpos);
    emit(eof);
    return eof;
}
}