import java.util.*;

public class Translationtranslation_956 {
    public void clearDFA() {
        for (int d = 0;
        d < decisionToDFA.length;
        d++) {
            decisionToDFA[d] = new DFA(atn.decisionToState[d], d);
        }
    }
}