import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_646 {
    public void recover(Parser recognizer, RecognitionException e) {
        if ( lastErrorIndex==recognizer.getCurrentToken().getTokenIndex() && lastErrorState == recognizer.getState()) {
            recognizer.consume();
            return;
        }
        lastErrorIndex = recognizer.getCurrentToken().getTokenIndex();
        lastErrorState = recognizer.getState();
        if ( lastErrorStates == null ) {
            lastErrorStates = new BitSet(1);
        }
        lastErrorStates.set(recogn);
    }
}