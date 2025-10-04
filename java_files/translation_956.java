import java.util.*;

public class Translation956 {
    public void clearDFA() {
    synchronized (_interp.decisionToDFA) {
        for (int d = 0;
        d < _interp.decisionToDFA.length;
        d++) {
            _interp.decisionToDFA[d] = new DFA(_atn.getDecisionState(d), d);
        }
    }
}
}