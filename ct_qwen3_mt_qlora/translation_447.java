import java.util.*;

public class Translation447 {
    1 public String getErrorHeader(RecognitionException e) {
    int line = e.getOffendingToken().getLine();
    int charPositionInLine = e.getOffendingToken().getCharPositionInLine();
    return "line " + line + ":" + charPositionInLine;
}
}