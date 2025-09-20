import java.util.*;

public class Translation447 {
    ublic String getErrorHeader(Parser recognizer) {
    int line = recognizer.getCurrentToken().getLine();
    int charPositionInLine = recognizer.getCurrentToken().getCharPositionInLine();
    return "line " + line + ":" + charPositionInLine;
}
}