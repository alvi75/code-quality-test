import java.util.*;

public class Translation680 {
    20 public Token emitEOF() {
    int cpos = column;
    int line = getLine();
    Token eof = factory.create(tokenSource, TokenConstants.EOF, null, TokenConstants.DefaultChannel, input.index, input.index - 1, line, cpos);
    emit(eof);
    return eof;
}
}