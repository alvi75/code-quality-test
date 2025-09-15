import java.util.*;

public class Translationtranslation_647 {
    public String toFormulaString() {
        String value = _string;
        int len = value.length();
        StringBuilder sb = new StringBuilder(len + 4);
        sb.append(CELL_DELIMITER);
        for(int i=0;
        i<len;
        i++) {
            char c = value.charAt(i);
            if (c == DELIM_CHAR) {
                sb.append(CELL_DELIMITER);
            }
            sb.append(c);
        }
        sb.append(CELL_DELIMITER);
        return sb.toString();
    }
}