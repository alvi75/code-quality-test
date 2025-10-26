import java.util.*;

public class Translation335 {
    ublic override String ToString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[CFRULE]\n");
    buffer.Append(" .condition_type =").Append(field_1_condition_type).Append("\n");
    buffer.Append(" OPTION FLAGS=0x").Append(StringUtil.ToHexString(Options)).Append("\n");
    if (ContainsFontFormattingBlock){
        buffer.Append(_fontFormatting.ToString()).Append("\n");
    }
    if (ContainsBorderFormattingBlock){
        buffer.Append(_borderFormatting.ToString()).Append("\n");
    }
    if (ContainsPatternFormattingBlock){
        buffer.Append(_patternFormatting.ToString()).Append("\n");
    }
    buffer.Append(" Formula 1 =").Append(ArrayUtil.ToCommaDelimitedString(field_17_formula1.Tokens)).Append("\n");
    buffer.Append(" Formula 2 =").Append(ArrayUtil.ToCommaDelimitedString(field_18_formula2.Tokens)).Append("\n");
    buffer.Append("[/CFRULE]\n");
    return buffer.ToString();
}
}