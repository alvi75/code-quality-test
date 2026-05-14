import java.util.*;

public class Translation447 {
    1 public String getErrorHeader(Parser recognizer) {
    2 int line = recognizer.getInputStream().LT(-1).getLine();
    3 int charPositionInLine = recognizer.getInputStream().LT(-1).getCharPositionInLine();
    4 return "line " + line + ":" + charPositionInLine;
}
}