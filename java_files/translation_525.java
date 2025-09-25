import java.util.*;

public class Translation525 {
    public boolean incrementToken() throws IOException {
    if ( used ) {
        return false ;
    }
    clearAttributes();
    termAtt.append(value);
    offsetAtt.setOffset(0, value.length);
    used = true;
    return true;
}
}