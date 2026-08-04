import java.util.*;

public class Generated_636767121a6d9265ec017b0a {
    public int parseEndOfLine(String headerPart, int end) {
        int index = end;
        while (index < headerPart.length()) {
            char c = headerPart.charAt(index);
            if (c == '\r') {
                if (index + 1 < headerPart.length() && headerPart.charAt(index + 1) == '\n') {
                    return index + 2;
                }
                return index + 1;
            } else if (c == '\n') {
                return index + 1;
            }
            index++;
        }
        return index;
    }
}