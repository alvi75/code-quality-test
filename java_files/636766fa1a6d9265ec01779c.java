import java.util.*;

public class Generated_636766fa1a6d9265ec01779c {
    private String parseToken(final char[] terminators) {
        final StringBuilder sb = new StringBuilder();
        while (true) {
            if (index >= tokens.length || index == -1)
                break;
            final Token t = tokens[index];
            if (t.type == TokenType.TERMINATOR && Arrays.binarySearch(terminators, t.value) > 0) {
                break;
            }
            sb.append(t.value);
            index++;
        }
        return sb.toString();
    }
}