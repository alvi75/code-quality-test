import java.util.*;

public class Translation310 {
    1 public boolean isExpectedToken(int symbol) {
    2 ATN atn = getInterpreter().getAtn();
    3 ParserRuleContext ctx = _ctx;
    4 ATNState s = atn.states[state];
    5 IntervalSet following = atn.getNextTokens(s);
    6 if (following.contains(symbol)) {
        7 return true;
        8 }
        9 if (!following.contains(TokenConstants.EOF)) {
            10 return false;
            11 }
            12 while (ctx != null && ctx.getInvokingState() >= 0 && following.contains(TokenConstants.EOF)) {
                13 ATNState invokingState = atn.states[ctx.getInvokingState()];
                14 RuleTransition rt = (RuleTransition)invokingState.transition(0);
                15 following = atn.getNextTokens(rt.followState);
                16 if (following.contains(symbol)) {
                    17 return true;
                    18 }
                    19 ctx = (ParserRuleContext)ctx.getParent();
                    20 }
                    21 if (following.contains(TokenConstants.EOF) && symbol == TokenConstants.EOF) {
                        22 return true;
                        23 }
                        24 return false;
                    }
}