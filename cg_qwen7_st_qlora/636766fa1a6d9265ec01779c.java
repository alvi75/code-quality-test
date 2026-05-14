import java.util.*;

public class Generated_636766fa1a6d9265ec01779c {
    private String parseToken(final char[] terminators){
        final StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hasNext()) break;
            final char c = nextChar();
            for (final char terminator : terminators) {
                if (c == terminator) {
                    unread(c);
                    return sb.toString().trim();
                }
            }
            sb.append(c);
        }
        return sb.toString().trim();
    }
}