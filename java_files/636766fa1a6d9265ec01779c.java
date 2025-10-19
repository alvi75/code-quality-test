import java.util.*;

public class Generated_636766fa1a6d9265ec01779c {
    private String parseToken(final char[] terminators) {
        int start = index;
        while (index < input.length()) {
            final char c = input.charAt(index);
            if (c == '\\' && index + 1 < input.length()) {
                // Escape character found, skip it.
                ++index;
            } else if (c == '}' || c == ' ' || c == '\n') {
                // Termination condition found.
                break;
            }
            ++index;
        }

        return input.substring(start, index);
    }
}