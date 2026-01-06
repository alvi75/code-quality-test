import java.util.*;

public class Translation948 {
    public int findEndOffset(StringBuffer buffer, int start) {
    if (start > buffer.length() || start < 0) return start;
    int offset, count = maxScan;
    for (offset = start;
    offset < buffer.length() && count > 0;
    count--) {
        if (boundaryChars.contains(buffer.charAt(offset))) return offset;
        offset++;
    }
    return start;
}
}