import java.util.*;

public class Translation647 {
    public String toFormulaString() {
    String value = _string;
    int len = value.length();
    StringBuilder sb = new StringBuilder(len + 4);
    sb.append(FormulaError.FORMULA_DELIMITER);
    for (int i = 0;
    i < len;
    i++) {
        char c = value.charAt(i);
        if (c == FormulaError.FORMULA_DELIMITER) {
            sb.append(FormulaError.FORMULA_DELIMITER);
        }
        sb.append(c);
    }
    sb.append(FormulaError.FORMULA_DELIMITER);
    return sb.toString();
}
}