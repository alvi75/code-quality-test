import java.util.*;

public class Translation647 {
    public String toFormulaString() {
    String value = getField_3_string();
    int len = value.length();
    StringBuilder sb = new StringBuilder(len + 4);
    sb.append( FORMULA_DELIMITER );
    for ( int i = 0 ;
    i < len ;
    i ++ ) {
        char c = value.charAt(i);
        if ( c == FORMULA_DELIMITER ) {
            sb.append( FORMULA_DELIMITER );
        }
        sb.append( c );
    }
    sb.append( FORMULA_DELIMITER );
    return sb.toString();
}
}