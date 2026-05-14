import java.util.*;

public class Translation680 {
    ublic Token emitEOF() {
    final int cpos = column;
    final int line = getLine();
    Token eof = tokenFactory.create(tokenFactorySourcePair, Token.EOF, null, DefaultTokenChannel, input.getIndex(), input.getIndex()-1, line, cpos);
    emit(eof);
    return eof;
}
}