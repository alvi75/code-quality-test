import java.util.*;

public class Generated_636767121a6d9265ec017b0a {
    private int parseEndOfLine(String headerPart, int end) {
        char[] data = headerPart.toCharArray();
        for (int i = 0; i < data.length; ++i) {
            if (data[i] == '\r' || data[i] == '\n') {
                return i;
            }
        }

        // If we get here then there is no end of line in this segment.
        return -1;
    }
}