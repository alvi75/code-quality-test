import java.util.*;

public class Translation738 {
    public int findEndOffset(StringBuffer buffer, int start) {
    if (start > buffer.length() || start < 0) return start;
    bi.setText(buffer.substring(start, buffer.length()));
    return bi.next() + start;
}
}