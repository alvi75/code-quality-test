import java.util.*;

public class Translation956 {
    1 public void clearDFA() {
    2 for (int d = 0;
    d < decisionToDFA.length;
    d++) {
        3 decisionToDFA[d] = new DFA(atn.getDecisionState(d), d);
        4 }
    }
}