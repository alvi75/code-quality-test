ublic Token emitEOF() {
    int cpos = Column;
    int line = Line;
    Token eof = factory.create(_tokenFactorySourcePair, TokenConstants.EOF, null, TokenConstants.DEFAULT_CHANNEL, _input.index(), _input.index()-1, line, cpos);
    emit(eof);
    return eof;
}