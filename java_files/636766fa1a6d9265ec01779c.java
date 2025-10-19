import java.util.*;

public class Generated_636766fa1a6d9265ec01779c {
    private String parseToken(final char[] terminators) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            char c = read();
            if (c == null || Arrays.asList(terminators).contains(c)) {
                break;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}