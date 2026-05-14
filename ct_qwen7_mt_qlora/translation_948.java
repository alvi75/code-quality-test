import java.util.*;

public class Translation948 {
    1 public int findEndOffset(CharSequence buffer, int start) {
    2 if (start > buffer.length() || start < 0)3 return start;
    4 int offset, count = maxScan;
    5 for (offset = start;
    offset < buffer.length() && count > 0;
    count--)6 if (boundaryChars.contains(buffer.charAt(offset)))7 return offset;
    8 return start;
}
}