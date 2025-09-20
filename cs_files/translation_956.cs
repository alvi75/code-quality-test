using System;
using System.Collections.Generic;

public class Translation956
{
    public void ClearDFA(){
    for (int d = 0;
    d < decisionToDFA.Length;
    d++){
        decisionToDFA[d] = new DFA(atn.decisionToState[d], d);
    }
}
}