import java.util.*;

public class Translation646 {
    ublic void recover(Parser recognizer, RecognitionException e) {
    if (lastErrorIndex == ((ITokenStream)recognizer.getInputStream()).index() && lastErrorStates != null && lastErrorStates.contains(recognizer.state)) {
        recognizer.consume();
    }
    lastErrorIndex = ((ITokenStream)recognizer.getInputStream()).index();
    if (lastErrorStates == null) {
        lastErrorStates = new IntervalSet();
    }
    lastErrorStates.add(recognizer.state);
    IntervalSet followSet = getErrorRecoverySet(recognizer);
    consumeUntil(recognizer, followSet);
}
}