import java.util.*;

public class Translationtranslation_335 {
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[CFRule1]\n");
        sb.append(" .ruleType = ").RuleType( ).append("\n");
        sb.append(" .cfOperator =").append(getConditionOperator()).append("\n");
        sb.append(" .formula1 = "). cfRuleRecord.getFormulaString());
        sb.append(" .formula2 =").append(getFormula2()).append("\n");
        if(isInvert()) {
            sb.append(" .invert =").append("true\n");
        }
        else {
            sb.append(" .invert =").append("false\n");
        }
        sb.append("[/CFRule1]\cfRules.add(this);
        return sb.toString();
    }
}