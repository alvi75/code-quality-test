import java.util.*;

public class Translation646 {
    public void recover(Parser recognizer, RecognitionException e) {
    if ( lastErrorIndex==recognizer.getInputStream().LA(1) && lastErrorStates!=null &&lastErrorStates.contains(recognizer.getState()) ) {
        recognizer.consume();
    }
    lastErrorIndex = recognizer.getInputStream().LA(1);
    if ( lastErrorStates==null ) {
        lastErrorStates = new IntervalSet();
    }
    lastErrorStates.add(recognizer.getState());
    IntervalSet followSet = getErrorRecoverySet(recognizer);
    consumeUntil(recognizer, followSet);
}
}