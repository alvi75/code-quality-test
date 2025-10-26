import java.util.*;

public class Translation738 {
    public int findEndOffset(CharSequence buffer, int start) {
    if (start > buffer.length() || start < 0) return start;
    buffer = new StringBuilder(buffer.toString(), start, buffer.length() - start);
    bi.setText(buffer);
    return bi.next() + start;
}
}