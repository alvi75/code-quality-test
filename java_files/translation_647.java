import java.util.*;

public class Translation647 {
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
        sb.append("'").append(c).append("'");
    }
    sb.append(DELIMITER);
}
else {
    sb.append("'").append(value).append("'");
}
return sb.toString();
}
}