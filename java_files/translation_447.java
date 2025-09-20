import java.util.*;

public class Translation447 {
    public String getErrorHeader(Parser recognizer) {
    int line = recognizer.getInterpreter().getCurrentInputLineNo();
    int charPositionInLine = recognizer.getInputStream().getCharIndex() - recognizer.getInputStream().getMark();
    String ruleName = recognizer.getContext().getRuleNames()[recognizer.getContext().getRuleIndex()];
    return "line " + line+ " col " + charPositionInLine +" : "+ruleName;
}
}