import java.util.*;

public class Translation447 {
    01 public String getErrorHeader(RecognitionException e) {
    02 int line = e.getOffendingToken().getLine();
    03 int charPositionInLine = e.getOffendingToken().getCharPositionInLine();
    04 return "line " + line + ":" + charPositionInLine;
}
}