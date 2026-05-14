import java.util.*;

public class Translation738 {
    1 public int findEndOffset(CharSequence buffer, int start) {
    2 if (start > buffer.length() || start < 0)3 return start;
    4 bi.setText(buffer.subSequence(start, buffer.length()).toString());
    5 return bi.next() + start;
}
}