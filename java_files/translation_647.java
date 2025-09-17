import java.util.*;

public class Translationtranslation_647 {
    public String toFormulaString() {
        String value = _value;
        int len = value.length();
        StringBuilder sb = new StringBuilder(len+4);
        sb.append(DELIMITER);
        for(int i=0;
        i<len;
        i++) {
            char c = value.charAt(i);
            if (c == DELIMITER) {
                sb.append(DELIMITER);
            }
            sb.append(c);
        }
        sb.append(DELIMITER);
        return sb.toString();
    }
}