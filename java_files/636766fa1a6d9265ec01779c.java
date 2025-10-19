import java.util.*;

public class Generated_636766fa1a6d9265ec01779c {
    private String parseToken(final char[] terminators) {
        final StringBuilder result = new StringBuilder();
        boolean foundTerminator = false;
        for (final char c : this.token.toCharArray()) {
            if (!foundTerminator && Character.isWhitespace(c)) {
                continue;
            }
            if (Character.isWhitespace(c) || Character.isDigit(c) || Character.isLetter(c)) {
                result.append(c);
            } else if (Character.isWhitespace(terminators[0]) || Character.isWhitespace(terminators[1])) {
                foundTerminator = true;
            } else {
                break;
            }
        }

        return result.toString();
    }
}