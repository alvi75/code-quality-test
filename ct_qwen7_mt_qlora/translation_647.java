import java.util.*;

public class Translation647 {
    1 public String toFormulaString() {
    2 final int len = _string.length();
    3 final StringBuilder sb = new StringBuilder(len + 4);
    4 sb.append(FORMULA_DELIMITER);
    5 for (int i = 0;
    i < len;
    i++) {
        6 char c = _string.charAt(i);
        7 if (c == FORMULA_DELIMITER) {
            8 sb.append(FORMULA_DELIMITER);
            9 }
            10 sb.append(c);
            11 }
            12 sb.append(FORMULA_DELIMITER);
            13 return sb.toString();
        }
}