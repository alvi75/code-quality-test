import java.util.*;

public class Translation335 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[CFRULE]\n");
    buffer.append(" .ruletype =").append(getRuleType()).append("\n");
    buffer.append(" .priority =").append(_priority).append("\n");
    buffer.append(" .formula_text =").append(_formulaText).append("\n");
    buffer.append(" .comparison_operator=").append(_operator).append("\n");
    buffer.append(" .formula1 =").append(HexDump.intToHex(_formula1.getRawFormulaToken().getValue())).append("\n");
    buffer.append(" .formula2 =").append(HexDump.intToHex(_formula2.getRawFormulaToken().getValue())).append("\n");
    buffer.append("[/CFRULE]\n");
    return buffer.toString();
}
}