import java.util.*;

public class Generated_636766fa1a6d9265ec01779c {
    private String parseToken(final char[] terminators) {
        final StringBuilder sb = new StringBuilder();
        int i;
        for (i = 0; i < this.token.length(); i++) {
            if (terminators[i] == this.token.charAt(i)) {
                break;
            }
            sb.append(this.token.charAt(i));
        }

        // If we have reached the end of the string, then just return it.
        if (i >= terminators.length) {
            return this.token.toString();
        } else {
            return sb.toString();
        }
    }
}