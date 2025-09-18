import java.util.*;

public class Translation738 {
    public int findEndOffset(StringBuilder buffer, int start) {
    if( start>buffer.length() || start<1 ) return start;
    bi.setText(buffer.substring( start, buffer.length() ) );
    return bi.next() + start;
}
}