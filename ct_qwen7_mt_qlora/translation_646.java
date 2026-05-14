import java.util.*;

public class Translation646 {
    1 public void recover(Parser recognizer, RecognitionException e) {
    2 if (lastErrorIndex == ((TokenStream)recognizer.getInputStream()).index()3 && lastErrorStates != null4 && lastErrorStates.contains(recognizer.getState()))5 {
        6 recognizer.consume();
        7 }
        8 lastErrorIndex = ((TokenStream)recognizer.getInputStream()).index();
        9 if (lastErrorStates == null)10 {
            11 lastErrorStates = new IntervalSet();
            12 }
            13 lastErrorStates.add(recognizer.getState());
            14 IntervalSet followSet = getErrorRecoverySet(recognizer);
            15 consumeUntil(recognizer, followSet);
        }
}