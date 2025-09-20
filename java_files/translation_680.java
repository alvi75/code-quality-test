import java.util.*;

public class Translation680 {
    public Token emitEOF() {
    int cpos = getColumn();
    int line = getLine();
    Token eof = new EOFToken(getTokenFactorySourcePair(), TokenConstants.EOF, null, TokenConstants.DEFAULT_CHANNEL, getInput().getCharIndex(), getInput().getCharIndex()-1, line, cpos);
    emit(eof);
    return eof;
}
}