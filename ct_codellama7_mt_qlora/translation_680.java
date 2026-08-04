import java.util.*;

public class Translation680 {
    public IToken emitEOF() {
    int cpos = getCharPositionInLine();
    int line = getLine();
    IToken eof = factory.create(_tokenFactorySourcePair, TokenConstants.EOF, null, TokenConstants.DefaultChannel, _input.index(), _input.index() - 1, line, cpos);
    emit(eof);
    return eof;
}
}