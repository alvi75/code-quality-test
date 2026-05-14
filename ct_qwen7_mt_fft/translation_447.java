import java.util.*;

public class Translation447 {
    public String getErrorHeader(RecognitionException e) {
    final int offToken = e.getOffendingToken().getTokenIndex();
    if (offToken == -1) {
        return "<unknown>";
    }
    String text = _input.getText(Interval.of(offToken, _input.index()));
    text = StringUtil.replaceNewlines(text, "\n", "");
    return "line "+e.getOffendingToken().getLine()+":"+e.getOffendingToken().getCharPositionInLine()+" "+StringUtil.escapeWhitespace(text, true);
}
}