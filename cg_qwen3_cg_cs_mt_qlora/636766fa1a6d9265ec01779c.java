import java.util.*;

public class Generated_636766fa1a6d9265ec01779c {
    private String parseToken(final char[] terminators){
        final StringBuilder sb = new StringBuilder();
        while (hasMoreTokens() && !isTerminator(peek())) {
            sb.append(read());
        }
        return sb.toString();
    }
}