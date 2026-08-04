import java.util.*;

public class Translation956 {
    public void clearDFA() {
    for (int d = 0;
    d < decisionToDFA.length;
    d++) {
        decisionToDFA[d] = new DFA(atn.getDecisionState(d), d);
    }
}
}