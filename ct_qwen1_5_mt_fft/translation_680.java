import java.util.*;

public class Translation680 {
    public Token emitEOF() {
    int cpos = column;
    int line = line;
    Token eof = factory.create(tokenFactorySourcePair, EOF, null, tokenStream.getCharIndex(0), tokenStream.getCharIndex(0) + input.length(), line, column);
    emit(eof);
    return eof;
}
}