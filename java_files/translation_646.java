import java.util.*;

public class Translation646 {
    public void recover(Parser recognizer, RecognitionException e) {
    if (lastErrorIndex == recognizer.getInputStream().getIndexOfToken() && lastErrorStates != null && !lastErrorStates.contains(recognizer.getState())) {
        recognizer.consume();
    }
    lastErrorIndex = recognizer.getInputStream().getIndexOfToken();
    lastErrorStates = new HashSet<>();
    lastErrorStates.add(recognizer.getState());
    IntervalSet followSet = getErrorRecoverySet(recognizer);
    consumeUntil(recognizer, followSet);
}
}