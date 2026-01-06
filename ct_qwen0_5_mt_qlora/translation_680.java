import java.util.*;

public class Translation680 {
    public Token emitEOF() {
    int cpos = getColumn();
    int line = getLine();
    Token eof = factory.create(factory.getTokenFactorySourcePair(), TokenConstants.EOF, null, factory.getChannel(), input.getIndex(), input.getIndex() - 1, line, cpos);
    emit(eof);
    return eof;
}
}