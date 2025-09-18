public void clearDFA() {
    for (int d = 0;
    d < decisionToDFA.length;
    d++) {
        decisionToDFA[d] = new DFA(atn.decisionToState[d], d);
    }
}