public QueryParserTokenManager(CharStream stream, int lexState){
    this(stream);
    SwitchTo(lexState);
}