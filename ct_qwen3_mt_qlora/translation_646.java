import java.util.*;

public class Translation646 {
    1 public void recover(Parser recognizer, RecognitionException e) {
    if ( lastErrorIndex == recognizer.getInputStream().index() && lastErrorStates != null && lastErrorStates.contains(recognizer.getState()) ) {
        recognizer.consume();
    }
    lastErrorIndex = recognizer.getInputStream().index();
    if ( lastErrorStates == null ) {
        lastErrorStates = new IntervalSet();
    }
    lastErrorStates.add(recognizer.getState());
    IntervalSet followSet = getErrorRecoverySet(recognizer);
    consumeUntil(recognizer, followSet);
}
}