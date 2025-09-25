import java.util.*;

public class Translation647 {
    public String toFormulaString() {
    String value = _string;
    int len = value.length();
    StringBuilder sb = new StringBuilder(len + 4);
    sb.append(FormulaDelimiters.DELIMITER);
    for(int i=0;
    i<len;
    i++) {
        char c = value.charAt(i);
        if (c == FormulaDelimiters.DELIMITER) {
            sb.append(FormulaDelimiters.DELIMITER);
        }
        sb.append(c);
    }
    sb.append(FormulaDelimiters.DELIMITER);
    return sb.toString();
}
}