import java.util.*;

public class Translation525 {
    public boolean incrementToken() {
    if ( used ) return false;
    clearAttributes();
    termAttribute.append( value );
    offsetAttribute.setOffset( 0, value.length() );
    used = true;
    return true;
}
}