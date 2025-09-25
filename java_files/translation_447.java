import java.util.*;

public class Translation447 {
    public String getErrorHeader(Parser recognizer) {
    if (recognizer != null && recognizer.getInputStream() instanceof CommonTokenStream) {
        CommonTokenStream tokens = (CommonTokenStream) recognizer.getInputStream();
        int start = tokens.getStartIndex();
        int stop = tokens.getStopIndex();
        String text = tokens.getText(start, stop);
        return "token=" + text;
    }
    else {
        return "";
    }
}
}