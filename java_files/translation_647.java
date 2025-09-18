import java.util.*;

public class Translation647 {
    public String toFormulaString() {
    String value = _string;
    int len = value.length();
    StringBuilder sb = new StringBuilder(len + 4);
    sb.append( formulaDelimiter );
    for(int i=0;
    i<len;
    i++) {
        char c = value.charAt(i);
        if (c == formulaDelimiter) {
            sb.append( formulaDelimiter );
        }
        sb.append( c );
    }
    sb.append( formulaDelimiter );
    return sb.toString();
}
}