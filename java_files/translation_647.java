import java.util.*;

public class Translation647 {
    public String toFormulaString() {
    String value = field_3_string;
    int len = value.length();
    StringBuilder sb = new StringBuilder(len + 4);
    sb.append(FormulaDelimiter.FORMULA_DELIMITER);
    for (int i=0;
    i<len;
    i++) {
        char c = value.charAt(i);
        if (c == FormulaDelimiter.FORMULA_DELIMITER) {
            sb.append(FormulaDelimiter.FORMULA_DELIMITER);
        }
        sb.append(c);
    }
    sb.append(FormulaDelimiter.FORMULA_DELIMITER);
    return sb.toString();
}
}