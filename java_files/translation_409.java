import java.util.*;

public class Translation409 {
    public int codepointCount(int start, int end) {
    if (start < 0 || end > count || start > end) {
        throw new IllegalArgumentException();
    }
    return Character.codePointCount(value, start, end - start);
}
}