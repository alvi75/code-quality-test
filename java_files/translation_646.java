import java.util.*;

public class Translation646 {
    public void recover(Parser recognizer, RecognitionException e ) {
    if ( lastErrorIndex == recognizer.getInputStream().getIndex() && lastErrorStates != null && lastErrorStates.contains(recognizer.getState()) ) {
        recognizer . consume();
    }
    lastErrorIndex = recognizer . getInputStream ( ) . getIndex ( ) ;
    if ( lastErrorStates == null ) {
        lastErrorStates = new IntervalSet ( ) ;
    }
    lastErrorStates . add ( recognizer . getState ( ) ) ;
    IntervalSet followSet = getErrorRecoverySet ( recognizer ) ;
    consumeUntil ( recognizer , followSet ) ;
}
}