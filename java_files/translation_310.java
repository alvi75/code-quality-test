import java.util.*;

public class Translation310 {
    public boolean isExpectedToken(int symbol) {
    int invokingState = invokingStateStack.peek();
    int invokingStateState = invokingState.getState();
    IntervalSet following = getNextTokens(invokingState);
    if (following.contains(symbol)) {
        return true;
    }
    if (!following.contains(TokenConstants.EPSILON)) {
        return false;
    }
    while (ctx != null && ctx.getInvokingState() >= 0 && following.contains(TokenConstants.EPSILON)) {
        atn = atnStates.get(ctx.getInvokingState());
        invokingState = atn.states[ctx.getInvokingState()].getState();
        following = getNextTokens(atn.states[ctx.getInvokingState()]);
        if (following.contains(symbol)) {
            return true;
        }
        ctx = (ParserRuleContext)ctx.getParent();
    }
    if (following.contains(TokenConstants.EPSILON) && symbol == TokenConstants.EOF) {
        return true;
    }
    return false;
}
}