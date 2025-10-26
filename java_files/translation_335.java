import java.util.*;

public class Translation335 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[CFRULE]\n");
    buffer.append(" .condition_type =").append(getConditionType()).append("\n");
    buffer.append(" OPTION FLAGS=0x").append(Integer.toHexString(Options)).append("\n");
    if (containsFontFormattingBlock) {
        buffer.append(fontFormatting.toString()).append("\n");
    }
    if (containsBorderFormattingBlock) {
        buffer.append(borderFormatting.toString()).append("\n");
    }
    if (containsPatternFormattingBlock) {
        buffer.append(patternFormatting.toString()).append("\n");
    }
    buffer.append(" Formula 1 =").append(Arrays.toString(field_17_formula1.getTokens())).append("\n");
    buffer.append(" Formula 2 =").append(Arrays.toString(field_18_formula2.getTokens())).append("\n");
    buffer.append("[/CFRULE]\n");
    return buffer.toString();
}
}