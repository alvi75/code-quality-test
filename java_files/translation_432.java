public ParseTreePattern compileParseTreePattern(String pattern, int patternRuleIndex) {
    if (getInputStream()!=null) {
        try {
            Lexer lexer = getInterpreter().newLexer(getATNWithBypassAlts());
            lexer.more();
            int startIndex = getStartIndex();
            jj_consume_token(0);
            Token t = lexer.getNextToken();
            boolean inErrorRecoveryMode = false;
            while ( t.getType()!=Token.EOF ) {
                switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
                    case ERROR:inErrorRecoveryMode = true;
                    jj_consume_token(RegexpToken.ERROR);
                    break;
                    default:jj_consume_token(t.getType());
                    break;
                }
                t = lexer.getNextToken();
            }
            if (inErrorRecoveryMode) {
                jj_la1[4] = jj_gen;
                goto label_4;
            }
            label_4:jj_consume_token(TokenConstants.EOF);
            if (tokens.LA(1)!=IntStreamConstants.EOF) {
                jj_expentry = new int[1];
                jj_expentry[0] = tokens.LA(1);
                tokens.consume();
            }
            {
                if (true) return new ParseTreePattern(this, pattern, patternRuleIndex, tokens.get(1), tokens.get(0), inErrorRecoveryMode, true );
            }
            throw new Error("Missing return statement in function");
        }