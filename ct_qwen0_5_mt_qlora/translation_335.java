import java.util.*;

public class Translation335 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[CFRULE]\n");
    buffer.append(" .condition_type =").append(field_1_condition_type).append("\n");
    buffer.append(" OPTION FLAGS=0x").append(String.format("%08X", Options)).append("\n");
    if (containsFontFormattingBlock) {
        buffer.append(_fontFormatting.toString()).append("\n");
    }
    if (containsBorderFormattingBlock) {
        buffer.append(_borderFormatting.toString()).append("\n");
    }
    if (containsPatternFormattingBlock) {
        buffer.append(_patternFormatting.toString()).append("\n");
    }
    buffer.append(" Formula 1 =").append(Arrays.toString(field_17_formula1.getTokens())).append("\n");
    buffer.append(" Formula 2 =").append(Arrays.toString(field_18_formula2.getTokens())).append("\n");
    buffer.append("[/CFRULE]\n");
    return buffer.toString();
}
}