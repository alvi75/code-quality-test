import java.util.*;

public class Translation447 {
    ublic String getErrorHeader(RecognitionException e) {
    int line = e.getOffendingToken().getLine();
    int charPositionInLine = e.getOffendingToken().getColumn();
    return "line " + line + ":" + charPositionInLine;
}
}