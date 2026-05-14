import java.util.*;

public class Translation646 {
    public void recover(Parser recognizer, RecognitionException e) {
    if (lastErrorIndex == ((TokenSource)recognizer.getInputStream()).index&& lastErrorStates!=null&& lastErrorStates.contains(recognizer.getState())){
        recognizer.consume();
    }
    lastErrorIndex = ((TokenSource)recognizer.getInputStream()).index;
    if (lastErrorStates==null) {
        lastErrorStates = new BitSet();
    }
    lastErrorStates.set(recognizer.getState());
    BitSet followSet = getErrorRecoverySet(recognizer);
    consumeUntil(recognizer,followSet);
}
}