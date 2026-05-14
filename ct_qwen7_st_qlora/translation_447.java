import java.util.*;

public class Translation447 {
    public String getErrorHeader(Parser recognizer) {
    String msg = getErrorMessage(recognizer.getOffendingToken(), recognizer);
    List<String> stack = recognize(recognizer);
    if ( stack.size() > 1 ) {
        msg += "\n"+String.join("\n", stack );
    }
    return msg;
}
}