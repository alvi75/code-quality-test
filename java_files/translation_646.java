import java.util.*;

public class Translation646 {
    public void recover(Parser recognizer , RecognitionException e ) {
    if ( lastErrorIndex == ((TokenStream)recognizer.getInputStream()).index() && lastErrorStates != null && lastErrorStates.contains(recognizer.getState()) ) {
        recognizer.consume();
    }
    lastErrorIndex = ((TokenStream)recognizer.getInputStream()).index();
    if ( lastErrorStates == null ) {
        lastErrorStates = new IntervalSet();
    }
    lastErrorStates.add(recognizer.getState());
    IntervalSet followSet = getErrorRecoverySet(recognizer);
    consumeUntil(recognizer, followSet);
}
}