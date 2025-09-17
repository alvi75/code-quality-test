import java.util.*;

public class Translationtranslation_447 {
    public String getErrorHeader(Parser recognizer) {
        int line = recognizer.getLine();
        int charPositionInLine = recognizer.getCharPositionInLine();
        return "line "+line+":"+charPositionInLine;
    }
}