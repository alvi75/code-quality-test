import java.util.*;

public class Translation680 {
    ublic Token emitEOF() {
    final int cpos = column;
    final int line = line;
    Token eof = factory.create(tokenSource, TokenConstants.EOF, null, TokenConstants.DefaultChannel, input.index, input.index - 1, line, cpos);
    emit(eof);
    return eof;
}
}