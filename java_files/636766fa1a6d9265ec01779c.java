import java.util.*;

public class Generated_636766fa1a6d9265ec01779c {
    private String parseToken(final char[] terminators) {
        final StringBuilder sb = new StringBuilder();
        boolean inToken = false;
        for (final char c : this.input) {
            if (inToken && !Character.isWhitespace(c)) {
                sb.append(c);
            } else if (Character.isWhitespace(c)) {
                inToken = true;
            } else if (!inToken && Character.isWhitespace(c) && terminators.length > 0) {
                break;
            }
        }

        return sb.toString();
    }
}