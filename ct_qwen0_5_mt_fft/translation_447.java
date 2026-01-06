import java.util.*;

public class Translation447 {
    public String getErrorHeader(RecognitionException e) {
    final int line = e.offendingToken.getLine();
    final int charPositionInLine = e.offendingToken.getCharPositionInLine();
    return "line " + line + ":" + charPositionInLine;
}
}