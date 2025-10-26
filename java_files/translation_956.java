ublic void clearDFA() {
    for (int d = 0;
    d < decisionToDFA.length;
    d++) {
        decisionToDFA[d] = new DFA(atn.getDecisionState(d), d);
    }
}