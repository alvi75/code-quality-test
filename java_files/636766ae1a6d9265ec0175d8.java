import java.util.*;

public class Generated_636766ae1a6d9265ec0175d8 {
    public static String buildContentRange() {
        if (contentRange == null) {
            return "";
        }
        int start = contentRange.indexOf('[');
        int end = contentRange.lastIndexOf(']');
        if (start < 0 || end < 0) {
            return "";
        }
        int length = end - start;
        if (length > 0) {
            return contentRange.substring(start + 1, end);
        } else {
            return contentRange.substring(start + 1);
        }
    }
}