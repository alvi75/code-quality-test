import java.util.*;

public class Translation335 {
    0);
}
buffer.append(" Option Flags=0x").append(String.format("%04X", options));
if (containsFontFormattingBlock) {
    buffer.append(fontFormatting.toString());
}
if (containsBorderFormattingBlock) {
    buffer.append(borderFormatting.toString());
}
if (containsPatternFormattingBlock) {
    buffer.append(patternFormatting.toString());
}
buffer.append(" Formula 1=").append(Arrays.toString(field_17_formula1.tokens)).append("\n");
buffer.append(" Formula 2=").append(Arrays.toString(field_18_formula2.tokens)).append("\n");
buffer.append("[/CFRULE]\n");
return buffer.toString();
}
}