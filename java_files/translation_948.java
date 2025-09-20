import java.util.*;

public class Translation948 {
    public final int findEndOffset(CharSequence buffer, int start) {
    if (start > buffer.length() || start < 0) return start;
    int offset, count = maxScan;
    for (offset = start;
    offset < buffer.length() && count > 0;
    count--) {
        if (boundaryChars.contains(Character.valueOf(buffer.charAt(offset)))) return offset;
        offset++;
    }
    return start;
}
}