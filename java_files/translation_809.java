ublic IntervalSet getExpectedTokensWithinCurrentRule() {
    ATN atn = interpreter.atn;
    ATNState s = atn.states[state];
    return atn.nextTokens(s);
}