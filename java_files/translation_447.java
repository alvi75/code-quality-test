import java.util.*;

public class Translation447 {
    public String getRuleInvocationStack(RuleContext p) {
    if ( p==null ) return "";
    String[] ruleNames = getRuleNames();
    StringBuilder buf = new StringBuilder();
    boolean needParens = false;
    for (int i=0;
    i<ruleNames.length;
    i++) {
        if ( p._ctx.getRuleIndex() == i ) {
            needParens = true;
            break;
        }
        else if ( p._ctx.getChild(i)!=null ) {
            buf.append(ruleNames[i]).
}