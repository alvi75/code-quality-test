import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_646 {
    public void recover(Parser recognizer, RecognitionException e) {
        if ( lastErrorIndex==recognizer.getInputStream().index() && lastErrorIndex!= -1 ) {
            recognizer.consume();
        }
        lastErrorIndex = recognizer.getInputStream().index();
        if ( lastErrorStates==null ) {
            lastErrorStates = new BitSet();
        }
        lastErrorStates.set(recognizer.getState());
        BitSet followSet = getErrorRecoverySet(recognizer);
        consumeUntil(recognizer, followSet);
    }
}