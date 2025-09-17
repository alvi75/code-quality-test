import java.util.*;

public class Translationtranslation_447 {
    public String getErrorHeader(ParserRuleContext ctx) {
        String ruleName = getRuleNames()[ctx.getRuleIndex()];
        int offendingState = _input.getState();
        String text = _input.getText(Interval.of(offendingState, _input.index()));
        if (text == null) {
            text = "<EOF>";
        }
        return "ParserRuleContext"+ "{
            " +"start=" + _start +", stop=" + _stop +", ctx=" + ctx +", rule="+ ruleName + ", text='" + text + "'/>";
        }
}