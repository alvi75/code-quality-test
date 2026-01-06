import java.util.*;

public class Translation738 {
    public int findEndOffset(StringBuilder buffer, int start) {
    if (start > buffer.length() || start < 0) return start;
    setText(buffer);
    return next(start) + start;
}
}