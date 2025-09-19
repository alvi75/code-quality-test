import java.util.*;

public class Translation738 {
    ublic int findEndOffset(StringBuilder buffer, int start) {
    if( start > buffer.length() || start < 0 ) return start;
    bi.setText(buffer.substring(start));
    bi.last();
    return bi.next();
}
}