import java.util.*;

public class Translation680 {
    ublic Token emitEOF() {
    int cpos = column;
    int line = getLine();
    Token eof = _factory.create(getSourcePos(), Token.EOF, null, Token.DEFAULT_CHANNEL, _input.index, _input.index-1, line, cpos);
    emit(eof);
    return eof;
}
}