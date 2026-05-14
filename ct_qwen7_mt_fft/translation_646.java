import java.util.*;

public class Translation646 {
    public void recover(Parser recognizer,RecognitionException e) {
    if ( lastErrorIndex.get()==((ParserATNSimulator)recognizer.getInterpreter()).atn.states.size() && lastErrorState!=null ) {
        consumeUntil(recognizer,lastErrorState.follows);
    }
    lastErrorIndex.set(((ParserATNSimulator)recognizer.getInterpreter()).atn.states.size());
    lastErrorState=null;
    recoverFromMismatchedToken(recognizer);
}
}