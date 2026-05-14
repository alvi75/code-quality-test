import java.util.*;

public class Translation447 {
    ublic String getErrorHeader(Parser recognizer) {
    int line = recognizer.getParserRuleContext().start.getLine();
    int charPositionInLine = recognizer.getParserRuleContext().start.getCharPositionInLine();
    return "line " + line + ":" + charPositionInLine;
}
}