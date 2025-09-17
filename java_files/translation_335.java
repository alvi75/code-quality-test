import java.util.*;

public class Translationtranslation_335 {
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[CFRULE]\n");
        sb.append(" .range = ").append(getRange()).append("\n");
        sb.append(" .criteria = ").append(getCriteria()).append("\n");
        if (getFormula1() != null) {
            sb.append(" .formula1 = ").append(getFormula1()).append("\n");
        }
        if (getFormula2() != null) {
            sb.append(" .formula2 = ").append(getFormula2()).append("\n");
        }
        sb.append("[/CFRULE]\n");
        return sb.toString();
    }
}