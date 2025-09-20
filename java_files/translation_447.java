import java.util.*;

public class Translation447 {
    public String getErrorHeader(RecognitionException re) {
    int line = re.getOffendingToken().getLine();
    int charPositionInLine = re.getOffendingToken().getCharPositionInLine();
    return "line "+line+" charPositionInLine "+charPositionInLine;
}
}