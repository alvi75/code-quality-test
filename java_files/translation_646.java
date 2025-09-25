import java.util.*;

public class Translation646 {
    public void recover(Parser recognizer,RecognitionException e) {
    if ( getRuleInvocationStack().isEmpty() ) return;
    int stateNumber = getRuleInvocationStack().peek();
    String ruleName = getRuleNames()[stateNumber];
    System.err.println("**** Rule " + ruleName + " threw exception " + e.getClass().getName());
    e.printStackTrace(System.err);
    try {
        consumeUntil(recognizer);
    }
    catch (RecognitionException re2) {
        System.err.println("**** ConsumeUntil choked while recovering from " + ruleName + " at line "+getLine()+":"+getColumn()+" : "+re2.getMessage());
        re2.printStackTrace(System.err);
    }
}
}