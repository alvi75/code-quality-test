import java.util.*;

public class Translation335 {
    ublic String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[CFRULE]\n");
    buffer.append(" .condition_type =").append(getConditionType()).append("\n");
    buffer.append(" OPTION FLAGS=0x").append(String.format("%X",getOptions())).append("\n");
    if (containsFontFormattingBlock()) {
        buffer.append(_fontFormatting.toString()).append("\n");
    }
    if (containsBorderFormattingBlock()) {
        buffer.append(_borderFormatting.toString()).append("\n");
    }
    if (containsPatternFormattingBlock()) {
        buffer.append(_patternFormatting.toString()).append("\n");
    }
    buffer.append(" Formula 1 =").append(Arrays.toString(getFormula1().tokens)).append("\n");
    buffer.append(" Formula 2 =").append(Arrays.toString(getFormula2().tokens)).append("\n");
    buffer.append("[/CFRULE]\n");
    return buffer.toString();
}
}