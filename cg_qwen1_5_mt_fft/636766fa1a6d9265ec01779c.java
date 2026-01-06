import java.util.*;

public class Generated_636766fa1a6d9265ec01779c {
    private String parseToken(final char[] terminators) {
        int start = pos;
        while(pos < len && !isTerminator(terminators, str.charAt(pos))) {
            ++pos;
        }
        return str.substring(start,pos);
    }
}