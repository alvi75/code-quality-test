import java.util.*;

public class Translation948 {
    public int findEndOffset(CharSequence buffer, int start) {
    if (start > buffer.length() || start < 0)return start;
    final int end = Math.min(start + maxScan - 1, buffer.length());
    char c;
    for (offset = start;
    offset <= end && count > 0;
    count--) {
        c = buffer.charAt(offset);
        if (boundaryChars.contains(c))return offset;
    }
    return start;
}
}