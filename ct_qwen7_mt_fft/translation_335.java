import java.util.*;

public class Translation335 {
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[CFRULE]\n");
    sb.append(" .ConditionType = ").append(getConditionType()).append("\n");
    sb.append(" .options = ").append(Integer.toHexString(getOptions())).append("\n");
    if(hasFontFormatting()) {
        sb.append(getFontFormatting().toString());
    }
    if(hasBorderFormatting()) {
        sb.append(getBorderFormatting().toString());
    }
    if(hasPatternFormatting()) {
        sb.append(getPatternFormatting().toString());
    }
    sb.append(" .Formula1 = ").append(FormulaError.REF.getString()).append("\n");
    sb.append(" .Formula2 = ").append(FormulaError.REF.getString()).append("\n");
    sb.append("[/CFRULE]\n");
    return sb.toString();
}
}