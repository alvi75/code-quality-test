import java.util.*;

public class Translation680 {
    public Token emitEOF() {
    final int cpos = column;
    final int line = getLine();
    final Token eof = factory.create(tokenFactorySourcePair, EOF, null, channel, input.index(), input.index()-1, line, cpos);
    emit(eof);
    return eof;
}
}