import java.util.*;

public class Translation680 {
    1 public Token emitEOF() {
    final int cpos = column;
    final int line = getLine();
    Token eof = _factory.create(_tokenFactorySourcePair, Token.EOF, null, Token.DEFAULT_CHANNEL, _input.getIndex(), _input.getIndex()-1, line, cpos);
    emit(eof);
    return eof;
}
}