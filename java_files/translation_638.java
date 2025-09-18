public QueryParserTokenManager(CharStream stream){
    init(stream);
    token_source = new QueryParserTokenSource(this);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0;
    i < 21;
    i++) jj_la1[i] = -1;
    for (int i = 0;
    i < jj_2_rtns.Length;
    i++) jj_2_rtns[i] = new JJCalls();
}