import java.util.*;

public class Translation646 {
    public final void recover(Parser recognizer, RecognitionException e) {
    if (lastErrorIndex == recognizer.getInputStream().index()&& lastErrorStates!=null&& lastErrorStates.contains(recognizer.getState())){
        recognizer.consume();
    }
}
}