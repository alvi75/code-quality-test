import java.util.*;

public class Generated_636766fa1a6d9265ec01779c {
    private String parseToken(final char[] terminators) {
        final StringBuilder builder = new StringBuilder();
        while (this.hasNext()) {
            if (isNextOneOf(terminators)) {
                break;
            }
            builder.append(this.next());
        }

        return builder.toString().trim();
    }
}