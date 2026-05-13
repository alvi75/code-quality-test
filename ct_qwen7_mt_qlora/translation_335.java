import java.util.*;

public class Translation335 {
    1 public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[CFRULE]\n");
    buffer.append(" .condition_type =").append(HexDump.shortToHex(getConditionType())).append("\n");
    buffer.append(" .option_flags =").append(HexDump.shortToHex(getOptionFlags())).append("\n");
    if (_fontFormatting != null) {
        buffer.append(_fontFormatting.toString());
    }
    if (_borderFormatting != null) {
        buffer.append(_borderFormatting.toString());
    }
    if (_patternFormatting != null) {
        buffer.append(_patternFormatting.toString());
    }
    buffer.append(" .formula1 =").append(FormulaError.toFormulaString(getFormula1())).append("\n");
    buffer.append(" .formula2 =").append(FormulaError.toFormulaString(getFormula2())).append("\n");
    buffer.append("[/CFRULE]\n");
    return buffer.toString();
}
}